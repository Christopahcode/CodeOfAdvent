package adapters

import gateways.FileReader

class FileUtils (private val resourcePath: String) : FileReader {

    override fun linesToStringArray(): List<String> {
        val base = resourcePath.removePrefix("/")
        val candidates = linkedSetOf(
            base,
            if (base.endsWith(".txt")) base else "$base.txt"
        )
        for (name in candidates) {
            val streamFromClass = FileUtils::class.java.getResourceAsStream("/$name")
            if (streamFromClass != null) {
                return streamFromClass.bufferedReader().useLines { it.toList() }
            }
            val cl = Thread.currentThread().contextClassLoader
            val streamFromCl = cl.getResourceAsStream(name)
            if (streamFromCl != null) {
                return streamFromCl.bufferedReader().useLines { it.toList() }
            }
        }
        throw IllegalArgumentException("File not found on following path: $resourcePath")
    }

    override fun singleLongLineSeparatedByCommaToStringArray(): List<String> {
        val normalizedPath = resourcePath.removePrefix("/").let { path ->
            if (path.endsWith(".txt")) path else "$path.txt"
        }

        val classLoaders = listOf(
            FileUtils::class.java.classLoader,
            Thread.currentThread().contextClassLoader,
            ClassLoader.getSystemClassLoader()
        )

        for (cl in classLoaders) {
            cl?.getResourceAsStream(normalizedPath)?.use { stream ->
                return stream.bufferedReader().use { reader ->
                    reader.readText()
                        .trim()
                        .split(",")
                        .map { it.trim() }
                        .filter { it.isNotEmpty() }
                }
            }
        }

        throw IllegalArgumentException("File not found: $resourcePath")
    }
}