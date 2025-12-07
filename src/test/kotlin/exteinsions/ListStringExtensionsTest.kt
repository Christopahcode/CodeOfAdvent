package exteinsions

import extensions.toListOfRanges
import kotlin.test.Test
import kotlin.test.assertEquals

class ListStringExtensionsTest {
    @Test
    fun `WHEN toListOfRanges WITH (11-22,95-115) SHOULD RETURN LIST OF INT PAIRS WITH CORRECT VALUES`() {
        val lines = listOf("11-22","95-115")
        val expected: List<Pair<Int, Int>> =listOf(Pair(11,22), Pair(95, 115))
        assertEquals(expected, lines.toListOfRanges())
    }
}