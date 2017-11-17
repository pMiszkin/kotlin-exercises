package com.allegro.training.kotlin.exercises.third

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import java.math.BigInteger

/*
object Task2Spek : Spek({
    describe("VulgarFraction operators") {
        val a = vf(2, 3)
        val b = vf(1, 2)

        on("2/3 + 1/2") {
            val result = a + b

            it("should return 7/6") {
                assertEquals(vf(7, 6), result)
            }
        }

        on("2/3 - 1/2") {
            val result = a - b

            it("should return 1/6") {
                assertEquals(vf(1, 6), result)
            }
        }

        on("2/3 * 1/2") {
            val result = a * b

            it("should return 2/6") {
                assertEquals(vf(2, 6), result)
            }
        }

        on("2/3 / 1/2") {
            val result = a / b

            it("should return 4/3") {
                assertEquals(vf(4, 3), result)
            }
        }

        on("2/3 > 1/2") {
            val result = a > b

            it("should return true") {
                assertTrue(result)
            }
        }

        on("2/3 < 1/2") {
            val result = a < b

            it("should return false") {
                assertFalse(result)
            }
        }
    }
})
*/
fun vf(a: Int, b: Int) = VulgarFraction(BigInteger.valueOf(a.toLong()), BigInteger.valueOf(b.toLong()))