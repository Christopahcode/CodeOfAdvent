package usecases.day02
import adapters.FileUtils
import extensions.isInvalidId
import extensions.parseRanges
import extensions.toNumberRanges

class InvalidIdManager {
    fun executePart01(lines: List<String>): Long {
        return lines.parseRanges()
            .toNumberRanges()
            .sumOf { range ->
                range.allRangesForCurrentRange
                    .filter { it.isInvalidId() }
                    .sumOf { it }
            }
    }
}

fun main() {
    val lines = FileUtils("Day02.txt").singleLongLineSeparatedByCommaToStringArray()
    //Part 01
    val invalidIdManager = InvalidIdManager()
    println("Result for Day 02, Part 01 is: + " + invalidIdManager.executePart01(lines))
}