package pl.allegro.training.kotlin.exercises.first

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import pl.allegro.training.kotlin.exercises.first.EchoProcess
import pl.allegro.training.kotlin.exercises.first.EventStreamProcess
import pl.allegro.training.kotlin.exercises.first.ShredProcess

internal class Task3Test {

    @Test
    fun `test echo process`() {
        assertEquals("test", EchoProcess<String>().run("test"))
    }

    @Test
    fun `test shred process with valid input`() {
        ShredProcess<String>().run("TOP SECRET")
    }

    @Test
    fun `test shred process with invalid input`() {
        assertThrows(IllegalArgumentException::class.java, { ShredProcess<String>().run("test") } )
    }

    @Test
    fun `test event stream process`() {
        assertEquals("test", EventStreamProcess("test").run(Unit))
    }
}