package exteinsions

import extensions.parseRanges
import kotlin.test.Test
import kotlin.test.assertEquals

class ListStringExtensionsTest {
    @Test
    fun `parseRanges converts strings to range pairs correctly`() {
        val input = listOf("11-22", "95-115")
        val expected = listOf(11 to 22, 95 to 115)
        assertEquals(expected, input.parseRanges())
    }
}