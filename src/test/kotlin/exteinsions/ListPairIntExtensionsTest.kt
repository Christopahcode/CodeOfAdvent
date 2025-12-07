package exteinsions

import extensions.parseRanges
import extensions.toNumberRanges
import usecases.day02.NumberRange
import kotlin.test.Test
import kotlin.test.assertEquals

class ListPairIntExtensionsTest {
    @Test
    fun `toNumberRanges expands pairs into full number lists`() {
        val from = 95
        val to = 115
        val parsedRanges = listOf("$from-$to").parseRanges()
        val expected = listOf(
            NumberRange(from to to, (from..to).toList())
        )
        assertEquals(expected, parsedRanges.toNumberRanges())
    }
    @Test
    fun `toNumberRanges expands pairs into full number lists multiple parsedRanges`() {
        val from01 = 998
        val to01 = 1012

        val from02 = 1188511880
        val to02 = 1188511890

        val parsedRanges = listOf("$from01-$to01","$from02-$to02" ).parseRanges()
        val expected = listOf(
            NumberRange(from01 to to01, (from01..to01).toList(),),
            NumberRange(from02 to to02, (from02..to02).toList(),),
        )
        assertEquals(expected, parsedRanges.toNumberRanges())
    }
}