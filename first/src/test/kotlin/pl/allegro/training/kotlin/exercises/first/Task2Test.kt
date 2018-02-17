package pl.allegro.training.kotlin.exercises.first

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import java.time.LocalDate
import java.util.Random

/*
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
    fun `after method should return true for 1986-04-27 being after 1986-03-28`() {
        val date1 = parseDate("1986-04-27")
        val date2 = parseDate("1986-03-28")

        assertTrue(date1 after date2)
    }

    @Test
    fun `after method should return false for 1986-04-26 after 1986-04-27`() {
        val date1 = parseDate("1986-04-26")
        val date2 = parseDate("1986-04-27")

        assertFalse(date1 after date2)
    }


    @Test
    fun `should work correctly for any pair of dates`() {
        val random = Random()
        repeat(10_000) {
            val date1 = random.nextInt(65536)
            val date2 = random.nextInt(65536)
            val date1Str = date1.toDateString()
            val date2Str = date2.toDateString()
            val parsedDate1 = parseDate(date1Str)
            val parsedDate2 = parseDate(date2Str)

            if (date1 > date2) {
                assertTrue(parsedDate1 after parsedDate2, "$date1Str should be after $date2Str")
                assertFalse(parsedDate2 after parsedDate1, "$date2Str should not be after $date1Str")
            }
            if (date1 < date2) {
                assertTrue(parsedDate2 after parsedDate1, "$date2Str should be after $date1Str")
                assertFalse(parsedDate1 after parsedDate2, "$date1Str should not be after $date2Str")
            }
            if (date1 == date2) {
                assertFalse(parsedDate1 after parsedDate2, "$date1Str should not be after $date2Str")
                assertFalse(parsedDate2 after parsedDate1, "$date2Str should not be after $date1Str")
            }
        }
    }

    private fun Int.toDateString() = LocalDate.parse("1900-01-01").plusDays(this.toLong()).toString()
}
*/