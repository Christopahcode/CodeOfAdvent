package extensions

fun List<String>.toListOfRanges(): List<Pair<Int, Int>> =
    map { it.split("-").let { (a, b) -> a.toInt() to b.toInt() } }