package extensions

import usecases.day02.NumberRange

fun List<Pair<Long, Long>>.toNumberRanges() =
    map { (s, e) ->
        require(s <= e) { "Invalid range : $s > $e" }
        NumberRange(s to e, (s..e).toList())
    }