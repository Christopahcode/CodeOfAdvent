package adapters.file

import adapters.FileUtils
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

class FileUtilsTest {

    @Test
    fun `When FileUtils-linesToStringArray, should add each line to array `() {
        val reader = FileUtils("Day01_testFile")
        val lines = reader.linesToStringArray()
        assertEquals(3, lines.size)
    }

    @Test
    fun `When FileUtils-linesToStringArray with file that does not exist, should throw exception`() {
        val reader = FileUtils("fil-som-ikke-eksisterer.txt")

        val exception = assertFailsWith<IllegalArgumentException> {
            reader.linesToStringArray()
        }

        assertTrue(exception.message!!.contains("Fant ikke filen"))
    }
}