package extensions

fun List<String>.parseRanges(): List<Pair<Int, Int>> =
    map { it.split("-").let { (a, b) -> a.toInt() to b.toInt() } }