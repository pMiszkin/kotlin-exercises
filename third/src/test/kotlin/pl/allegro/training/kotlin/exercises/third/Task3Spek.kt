package pl.allegro.training.kotlin.exercises.third

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import java.math.BigInteger


object Task3Spek : Spek({
    describe("Customer scoring") {
        val john = Customer("John", income = 110_000, age = 17)
        val jane = Customer("Jane", income = 120_000, age = 23)
        val richard = Customer("Richard", income = 150_000, age = 38)
        val bill = Customer("Bill", income = 70_000, age = 63)

        on("score John") {
            val result = scorer.invoke(john)

            it("should return 0") {
                assertEquals(0, result)
            }
        }

        on("score Jane") {
            val result = scorer.invoke(jane)

            it("should return 3") {
                assertEquals(3, result)
            }
        }

        on("score Richard") {
            val result = scorer.invoke(richard)

            it("should return 8") {
                assertEquals(8, result)
            }
        }

        on("score Bill") {
            val result = scorer.invoke(bill)

            it("should return 0") {
                assertEquals(0, result)
            }
        }

        on("sort by score") {
            val result = listOf(john, jane, richard, bill).scoreSorted(scorer)

            it("should return John, Bill, Jane, Richard") {
                assertEquals(listOf(john, bill, jane, richard), result)
            }
        }

    }
})
