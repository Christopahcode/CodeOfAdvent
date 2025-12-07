package extensions

fun String.toSteps(): Int =
    this.dropWhile { !it.isDigit() }
        .takeWhile { it.isDigit() }
        .toIntOrNull() ?: 0