package pl.allegro.training.kotlin.exercises.first

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

class MyDate(
        override val day: Int,
        override val month: Int,
        override val year: Int) : Date {

    override fun after(other: Date): Boolean = year*1000000+month*100+day > other.year*1000000+other.month*100+other.day

    fun equals(other: Date): Boolean = year*1000000+month*100+day > other.year*1000000+other.month*100+other.day
}

fun parseDate(dateStr: String): Date {
    val (year, month, day) =
            ( DATE_REGEX.matchEntire(dateStr) ?: throw IllegalArgumentException() ).destructured
    if(day.toInt() > maksymalna_liczba_dni_w_miesiacu_danego_roku(month.toInt(), year.toInt())) throw IllegalArgumentException()
    return MyDate(day.toInt(), month.toInt(), year.toInt())
}
