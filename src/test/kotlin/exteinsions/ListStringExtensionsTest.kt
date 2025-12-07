package exteinsions

import extensions.parseRanges
import kotlin.test.Test
import kotlin.test.assertEquals

class ListStringExtensionsTest {
    @Test
    fun `parseRanges converts strings to range pairs correctly`() {
        val input = listOf("11-22", "95-115")
        val expected = listOf(11L to 22L, 95L to 115L)
        assertEquals(expected, input.parseRanges())
    }
}