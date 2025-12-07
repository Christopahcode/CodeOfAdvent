package usecases.day02

data class NumberRange(
   val currentRange: Pair<Int, Int>,
   val allRangesForCurrentRange: List<Int>
)