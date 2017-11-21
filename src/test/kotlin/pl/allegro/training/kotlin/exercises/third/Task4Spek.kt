package pl.allegro.training.kotlin.exercises.third

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import java.lang.reflect.Modifier
import kotlin.reflect.jvm.javaConstructor

/*
object Task4Spek : Spek({
    describe("Person creation") {
        on("create Person with Person.create") {
            val result = Person.create("John", "Doe")

            it("should return proper object") {
                assertEquals(result.firstName, "John")
                assertEquals(result.lastName, "Doe")
            }
        }

        on("getting list of public constructors of Person") {
            assertTrue(Person::class.constructors.all {
                it.javaConstructor!!.modifiers and Modifier.PRIVATE != 0
            })
        }
    }
})
*/