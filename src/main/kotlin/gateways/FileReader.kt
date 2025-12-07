package gateways

interface FileReader {
    fun linesToStringArray(): List<String>
    fun singleLongLineSeparatedByCommaToStringArray(): List<String>
}