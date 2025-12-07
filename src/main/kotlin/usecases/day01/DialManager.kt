package usecases.day01

import adapters.FileUtils
import extensions.toSteps


class DialManager() {
    var position: Int = 50
    var result: Int = 0
    val zero: Int = 0

    fun goUp(steps: Int) { position = (position + steps + 1000) % 100 }
    fun goDown(steps: Int) { position = (position - steps + 1000) % 100 }
    fun directionOf(line: String): Char = line.first { it == 'L' || it == 'R' }
    fun goUpResult(steps: Int, currentPosition: Int): Int {
        var result = steps / 100
        val rest = steps % 100
        if (currentPosition + rest >=  100) {result++}
        if (currentPosition + rest == zero) {result++}
        return result
    }
    fun goDownResult(steps: Int, currentPosition: Int): Int {
        var result = steps / 100
        val rest = steps % 100
        if (currentPosition - rest <=  zero) {result++}
        if (currentPosition == zero && currentPosition - rest < zero) {result--}
        return result
    }

    fun executePart01(lines: List<String>): Int{
        for (line in lines) {
            val direction = directionOf(line)
            val steps = line.toSteps()
            when (direction) {
                'R' -> goUp(steps)
                'L' -> goDown(steps)
            }
            if (position == zero) {
                result++
            }
        }
        return result
    }

    fun executePart02(lines: List<String>): Int {
        for (line in lines) {
            val direction = directionOf(line)
            val steps = line.toSteps()
            val currentPosition = position

            when (direction) {
                'R' -> goUp(steps)
                'L' -> goDown(steps)
            }
            when (direction) {
                'R' -> result += goUpResult(steps, currentPosition)
                'L' -> result += goDownResult(steps, currentPosition)
            }
        }
        return result
    }
}

fun main() {
    val lines = FileUtils("Day01.txt").linesToStringArray()
    //Part 01
    val dialManagerPart1 = DialManager()
    dialManagerPart1.executePart01(lines)
    println("Result for Day 01, Part 01 is: ${dialManagerPart1.result}")
    //Part 02
    val dialManagerPart2 = DialManager()
    dialManagerPart2.executePart02(lines)
    println("Result for Day 01, Part 02 is: ${dialManagerPart2.result}")
}