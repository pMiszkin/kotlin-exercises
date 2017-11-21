package pl.allegro.training.kotlin.exercises.first

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class Task2Test {

    @Test
    fun `should parse proper date`() {
        val date = parseDate("1986-04-26")

        assertEquals(date.year, 1986)
        assertEquals(date.month, 4)
        assertEquals(date.day, 26)
    }

    @Test
    fun `should throw when date has invalid format`() {
        assertThrows(IllegalArgumentException::class.java, { parseDate("1986/04/26") })
    }

    @Test
    fun `should throw when month is out of range`() {
        assertThrows(IllegalArgumentException::class.java, { parseDate("1986/13/26")})
    }

    @Test
    fun `should throw when day is out of range`() {
        assertThrows(IllegalArgumentException::class.java, { parseDate("1986-04-31")})
    }

    @Test
    fun `should proper handle leap year`() {
        val date = parseDate("2000-02-29")

        assertEquals(date.year, 2000)
        assertEquals(date.month, 2)
        assertEquals(date.day, 29)
    }

    @Test
    fun `after method should return true for date1 being after date2`() {
        val date1 = parseDate("1986-04-27")
        val date2 = parseDate("1986-04-26")

        assertTrue(date1 after date2)
    }

    @Test
    fun `after method should return false for date1 after date2`() {
        val date1 = parseDate("1986-04-26")
        val date2 = parseDate("1986-04-27")

        assertFalse(date1 after date2)
    }
}