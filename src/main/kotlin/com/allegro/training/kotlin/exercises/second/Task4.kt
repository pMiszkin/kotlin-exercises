package com.allegro.training.kotlin.exercises.second

/**
 * Given a [Quadraple] type below create an `asString()` extesion function on `Quadruaple?` (a nullable type) so that it correctly either
 * calls `toString()` or returns a `NULL` constant.
 */

data class Quadraple(
    val first: Int,
    val second: Int,
    val third: Int,
    val fourth: Int
)

