package pl.allegro.training.kotlin.exercises.first

/*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import kotlin.reflect.full.createType

internal class Task1Test {

    @Test
    fun `should return proper string for both message and httpStatus given`() {
        //given
        val error = MyError("CRITICAL_ERROR", "Something went wrong", 503)

        //when
        val result = error.toString()

        //then
        assertEquals("503:Something went wrong", result)
    }

    @Test
    fun `should return proper string for null message and given httpStatus`() {
        //given
        val error = MyError("NOT_FOUND", null, 404)

        //when
        val result = error.toString()

        //then
        assertEquals("404:null", result)
    }

    @Test
    fun `should return proper string for given message and default httpStatus`() {
        //given
        val error = MyError("CRITICAL_ERROR", "Something went wrong")

        //when
        val result = error.toString()

        //then
        assertEquals("500:Something went wrong", result)
    }

    @Test
    fun `should have proper constructor signature`() {
        assertEquals(1, MyError::class.constructors.size)

        val constructor = MyError::class.constructors.first()
        assertTrue(constructor.parameters.size == 3)

        val nonNullableStringType = String::class.createType(nullable = false)
        val nullableStringType = String::class.createType(nullable = true)
        val nonNullableIntType = Int::class.createType(nullable = false)

        assertFalse(constructor.parameters[0].isOptional)
        assertTrue(constructor.parameters[0].type == nonNullableStringType)

        assertFalse(constructor.parameters[1].isOptional)
        assertTrue(constructor.parameters[1].type == nullableStringType)

        assertTrue(constructor.parameters[2].isOptional)
        assertTrue(constructor.parameters[2].type == nonNullableIntType)
    }
}

*/