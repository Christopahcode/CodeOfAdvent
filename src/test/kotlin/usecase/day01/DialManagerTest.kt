package usecase.day01
import adapters.FileUtils
import extensions.isDown
import extensions.isUp
import usecases.day01.DialManager
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class DialManagerTest {

    @Test
    fun `When dial-goUp(5) should increase position`() {
       val dial = DialManager()
       dial.goUp(5)
       assertEquals(55,dial.position)
    }
    @Test
    fun `WHEN dial-goUp(5) AND position99 THEN SHOULD position BE 4`() {
        val dial = DialManager()
        dial.position = 99
        dial.goUp(5)
        assertEquals(4,dial.position)
    }
    @Test
    fun `WHEN dial-goDown(5) AND position1 THEN SHOULD position BE 96`() {
        val dial = DialManager()
        dial.position = 1
        dial.goDown(5)
        assertEquals(96,dial.position)
    }
    @Test
    fun `When dial-goDown(5) should decrease position`() {
        val dial = DialManager()
        dial.goDown(5)
        assertEquals(45,dial.position)
    }
    @Test
    fun `DEFAULT dial-rangeStart SHOULD BE 0`() {
        val dial = DialManager()
        assertEquals(0,dial.result)
    }
    @Test
    fun `When dial-isUp IS R SHOULD return true`() {
        assertTrue('R'.isUp())
    }

    @Test
    fun `When dial-isDown IS L SHOULD return true`() {
        assertTrue('L'.isDown())
    }
    @Test
    fun `when dial-goUpResult SHOULD return correct for edge cases`() {
        val dial = DialManager()

        dial.position = 95
        assertEquals(1, dial.goUpResult(60, dial.position))
        dial.goUp(60)
        assertEquals(55, dial.position)

        dial.position = 52
        assertEquals(1, dial.goUpResult(48, dial.position))
        dial.goUp(48)
        assertEquals(0, dial.position)
    }

    @Test
    fun `when dial-goDownResult SHOULD return correct for edge cases`() {
        val dial = DialManager()

        dial.position = 50
        assertEquals(1, dial.goDownResult(68, dial.position))
        dial.goDown(68)
        assertEquals(82, dial.position)

        dial.position = 99
        assertEquals(1, dial.goDownResult(99, dial.position))
        dial.goDown(99)
        assertEquals(0, dial.position)
    }

    @Test
    fun `When execute Part 1 with Day01-Snippet-file should give correct answer 3`() {
        val dial = DialManager()
        val reader = FileUtils("Day01_snippet.txt")
        val lines = reader.linesToStringArray()
        assertEquals(3,dial.executePart01(lines))
    }

    @Test
    fun `When execute Part 2 with Day01-Snippet-file should give correct answer 6`() {
        val dial = DialManager()
        val reader = FileUtils("Day01_snippet.txt")
        val lines = reader.linesToStringArray()
        assertEquals(6,dial.executePart02(lines))
    }
}