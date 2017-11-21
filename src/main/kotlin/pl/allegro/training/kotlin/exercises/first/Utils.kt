package pl.allegro.training.kotlin.exercises.first

private val maxDays = intArrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

/**
 * [month] - 1..12
 */
internal fun maksymalna_liczba_dni_w_miesiacu_danego_roku(month: Int, year: Int): Int = when (month) {
    2        -> if (year.isLeap()) 29 else 28
    in 1..12 -> maxDays[month - 1]
    else     -> throw IllegalArgumentException("Month should be in 1..12 range")
}

private fun Int.isLeap(): Boolean = when {
    this % 400 == 0 -> true
    this % 100 == 0 -> false
    this % 4 == 0   -> true
    else            -> false
}