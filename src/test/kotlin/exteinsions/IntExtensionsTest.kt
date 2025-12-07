package exteinsions
import extensions.distanceTo
import extensions.splitInHalfOrNull
import kotlin.test.Test
import kotlin.test.assertEquals

class IntExtensionsTest {

    @Test
    fun `WHEN diff SHOULD RETURN the difference between the numbers`() {
        assertEquals(7, 10 distanceTo 3)
        assertEquals(7, -10 distanceTo  -3)
        assertEquals(2_147_483_648L, Int.MIN_VALUE distanceTo 0)
        assertEquals(2_147_483_648L, 0 distanceTo Int.MIN_VALUE)
        assertEquals(4_294_967_295L, Int.MIN_VALUE distanceTo Int.MAX_VALUE)
    }
    @Test
    fun `WHEN splitInHalfOrNull(55) SHOULD RETURN Pair(5,5)`() {
        assertEquals(Pair(5,5), 55.splitInHalfOrNull())
    }
    @Test
    fun `WHEN splitInHalfOrNull(1188511885) SHOULD RETURN Pair(11885,11885)`() {
        assertEquals(Pair(11885, 11885), 1188511885.splitInHalfOrNull())
    }
    @Test
    fun `WHEN splitInHalfOrNull WITH odd-length number 3 SHOULD RETURN NULL`() {
        assertEquals(null, 123.splitInHalfOrNull())
    }
    @Test
    fun `WHEN splitInHalfOrNull WITH odd-length number 5 SHOULD RETURN NULL`() {
        assertEquals(null, 12345.splitInHalfOrNull())
    }
    @Test
    fun `WHEN splitInHalfOrNull WITH odd-length number 7 SHOULD RETURN NULL`() {
        assertEquals(null, 1234567.splitInHalfOrNull())
    }
}

