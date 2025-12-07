package exteinsions

import extensions.isDown
import extensions.isUp
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue


class CharExtensionsTest {

    @Test
    fun `WHEN R-isUp SHOULD RETURN TRUE`() {
        assertTrue { 'R'.isUp() }
    }
    @Test
    fun `WHEN L-isUp SHOULD RETURN FALSE`() {
        assertFalse { 'L'.isUp() }
    }
    @Test
    fun `WHEN A-isUp SHOULD RETURN FALSE`() {
        assertFalse { 'A'.isUp() }
    }

    @Test
    fun `WHEN L-isDown SHOULD RETURN TRUE`() {
        assertTrue { 'L'.isDown() }
    }
    @Test
    fun `WHEN R-isDown SHOULD RETURN FALSE`() {
        assertFalse { 'R'.isDown() }
    }
    @Test
    fun `WHEN A-isDown SHOULD RETURN FALSE`() {
        assertFalse { 'A'.isDown() }
    }
}