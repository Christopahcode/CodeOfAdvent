package usecases.day02

data class NumberRange(
   val currentRange: Pair<Long, Long>,
   val allRangesForCurrentRange: List<Long>
)