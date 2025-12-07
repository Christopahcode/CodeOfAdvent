package exteinsions

import extensions.toSteps
import kotlin.test.Test
import kotlin.test.assertEquals

class StringExtensionsTest {

    @Test
    fun `toSteps extracts the number after L or R`() {
        assertEquals(68, "L68".toSteps())
        assertEquals(30, "L30".toSteps())
        assertEquals(48, "R48".toSteps())
        assertEquals(5,  "L5".toSteps())
        assertEquals(60, "R60".toSteps())
        assertEquals(99, "L99".toSteps())
        assertEquals(14, "R14".toSteps())
        assertEquals(82, "L82".toSteps())
    }

    @Test
    fun `toSteps works with single digit and extra characters`() {
        assertEquals(1, "L1".toSteps())
        assertEquals(0, "R0".toSteps())
        assertEquals(123, "L123abc".toSteps())
    }

    @Test
    fun `toSteps returns 0 when no digits`() {
        assertEquals(0, "XYZ".toSteps())
        assertEquals(0, "".toSteps())
    }
}