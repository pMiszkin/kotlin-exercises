package pl.allegro.training.kotlin.exercises.first

import pl.allegro.training.kotlin.exercises.first.maksymalna_liczba_dni_w_miesiacu_danego_roku as maxDaysInMonth

/**
 * Create implementation of the `parseDate` function - the date will be
 * provided in yyyy-mm-dd format. You should use `DATE_REGEX` to parse given string.
 * Use destructuring on parsed result. If the string provided is not parsable as a proper date
 * the function should throw [IllegalArgumentException].
 *
 * To check if any given day do not exceed maximum day number in month, use
 * maksymalna_liczba_dni_w_miesiacu_danego_roku() function. Make sure to provide
 * some sane alias for it.
 *
 * Handy functions:
 * [Regex.matchEntire],
 * [MatchResult.destructured]
 */

private val DATE_REGEX = Regex("([1-9][0-9]{3})-([0-1][0-9])-([0-3][0-9])")

interface Date {
    val day: Int
    val month: Int
    val year: Int

    infix fun after(other: Date): Boolean
}

data class SimpleDate(
    override val day: Int,
    override val month: Int,
    override val year: Int
): Date {
    override fun after(other: Date): Boolean =
        dayNo(year, month, day) > dayNo(other.year, other.month, other.day)

    private fun dayNo(year: Int, month: Int, day: Int): Int =
        year*400 + month*32 + day
}

fun parseDate(dateStr: String): Date = DATE_REGEX.matchEntire(dateStr)?.let {
    val (yearStr, monthStr, dayStr) = it.destructured
    val year = yearStr.toInt()
    val month = monthStr.toInt()
    val day = dayStr.toInt()

    if (month < 1 || month > 12 || day < 1 || day > maxDaysInMonth(month, year)) {
        throw IllegalArgumentException("Invalid day or month")
    }

    SimpleDate(day, month, year)
} ?: throw IllegalArgumentException("Cannot parse date")
