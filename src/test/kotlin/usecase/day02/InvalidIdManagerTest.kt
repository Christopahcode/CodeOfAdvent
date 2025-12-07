package usecase.day02

import adapters.FileUtils
import usecases.day02.InvalidIdManager
import kotlin.test.Test
import kotlin.test.assertEquals

class InvalidIdManagerTest {

    @Test
    fun `When execute Part 1 with Day02-Snippet-file should give correct answer 1227775554`() {
        val invalidIdManager = InvalidIdManager()
        val lines = FileUtils("Day02_snippet.txt").singleLongLineSeparatedByCommaToStringArray()
        assertEquals(1227775554, invalidIdManager.executePart01(lines))
    }
}