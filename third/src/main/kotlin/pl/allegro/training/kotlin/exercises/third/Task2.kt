package pl.allegro.training.kotlin.exercises.third

import java.math.BigInteger

/**
 * Define +, -, * and / operators on the [VulgarFraction].
 * Define [compareTo] function so that <, > work as expected.
 */

data class VulgarFraction(
    val numerator: BigInteger,
    val denominator: BigInteger
) {

}