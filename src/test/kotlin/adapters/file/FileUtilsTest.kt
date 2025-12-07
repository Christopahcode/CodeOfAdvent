package adapters.file

import adapters.FileUtils
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertTrue

class FileUtilsTest {

    @Test
    fun `When FileUtils-linesToStringArray, should add each line to array `() {
        val reader = FileUtils("Day01_snippet.txt")
        val lines = reader.linesToStringArray()
        assertEquals(10, lines.size)
    }

    @Test
    fun `When FileUtils-linesToStringArray with file that does not exist, should throw exception`() {
        val reader = FileUtils("no-file.txt")
        val exception = assertFailsWith<IllegalArgumentException> {
            reader.linesToStringArray()
        }
        assertTrue(exception.message!!.contains("File not found"))
    }

    @Test
    fun `When FileUtils-singleLongLineSeparatedByCommaToStringArray, should add values separated by commas to array `() {
        val reader = FileUtils("Day02_snippet.txt")
        val lines = reader.singleLongLineSeparatedByCommaToStringArray()
        assertEquals(11, lines.size)
        assertEquals("824824821-824824827", lines[9])
    }
}