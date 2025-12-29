package usecases.day02
import adapters.FileUtils
import extensions.isInvalidId
import extensions.isInvalidIdPart02
import extensions.parseRanges
import extensions.toNumberRanges

class InvalidIdManager {
    fun executePart01(lines: List<String>): Long {
        return lines.parseRanges()
            .toNumberRanges()
            .flatMap { it.allRangesForCurrentRange }
            .filter { it.isInvalidId() }
            .sumOf { it }
    }

    fun executePart02(lines: List<String>): Long {
        return lines.parseRanges()
            .toNumberRanges()
            .flatMap { it.allRangesForCurrentRange }
            .filter { it.isInvalidIdPart02() }
            .sumOf { it }
    }
}

fun main() {
    val lines = FileUtils("Day02.txt").singleLongLineSeparatedByCommaToStringArray()
    val invalidIdManager = InvalidIdManager()
    println("Result for Day 02, Part 01 is:" + invalidIdManager.executePart01(lines))
    println("Result for Day 02, Part 02 is:" + invalidIdManager.executePart02(lines))
}