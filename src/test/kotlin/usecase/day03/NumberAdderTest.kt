package usecase.day03

import adapters.FileUtils
import usecases.day03.NumberAdderManager
import kotlin.test.Test
import kotlin.test.assertEquals

class NumberAdderTest {

    @Test
    fun `When execute NumberAdderManager executePart01 with Day03-Snippet-file should return array of size 4`() {
        val lines = FileUtils("Day03_snippet.txt").linesToStringArray()
        assertEquals(357, NumberAdderManager().executePart01(lines))
    }
}