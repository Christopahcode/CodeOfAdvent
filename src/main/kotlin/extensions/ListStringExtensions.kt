package extensions

fun List<String>.parseRanges(): List<Pair<Long, Long>> =
    map { it.split("-").let { (a, b) -> a.toLong() to b.toLong() } }
