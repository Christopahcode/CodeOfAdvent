package exteinsions
import extensions.distanceTo
import kotlin.test.Test
import kotlin.test.assertEquals

class IntExtensionsTest {

    @Test
    fun `WHEN Int-diff SHOULD RETURN the difference between the numbers`() {
        assertEquals(7, 10 distanceTo 3)
        assertEquals(7, -10 distanceTo  -3)
        assertEquals(2_147_483_648L, Int.MIN_VALUE distanceTo 0)
        assertEquals(2_147_483_648L, 0 distanceTo Int.MIN_VALUE)
        assertEquals(4_294_967_295L, Int.MIN_VALUE distanceTo Int.MAX_VALUE)
    }
}

