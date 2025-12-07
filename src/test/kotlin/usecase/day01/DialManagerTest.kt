package adapters.usecase.day01
import isDown
import isUp
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
}