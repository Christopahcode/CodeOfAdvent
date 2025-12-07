package exteinsions

import extensions.isInvalidId
import kotlin.test.Test
import kotlin.test.assertEquals

class LongExtensionsTest {
    @Test
    fun `WHEN isInvalidId(123123L) SHOULD RETURN TRUE`() {
        assertEquals(true, 123123L.isInvalidId())
    }
    @Test
    fun `WHEN isInvalidId(1231235L) SHOULD RETURN FALSE`() {
        assertEquals(false, 1231235L.isInvalidId())
    }
    @Test
    fun `WHEN isInvalidId(38593859L) SHOULD RETURN TRUE`() {
        assertEquals(true, 38593859L.isInvalidId())
    }
}