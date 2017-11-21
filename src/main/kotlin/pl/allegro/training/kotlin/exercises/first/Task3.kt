package pl.allegro.training.kotlin.exercises.first

/**
 * Create the following implementations of `Process` interface:
 * * `EchoProcess<T>: Process<T, T>` - the `run` method should simply return the `input` argument,
 * * `ShredProcess<A>: Process<A, Unit>` - the `run` method should check if the string representation of input
 *   (i.e. the value returned by calling `toString`) contains "TOP SECRET" and if it's not it should throw [IllegalArgumentException],
 * * `EventStreamProcess(output: B): Process<A, Unit>` - the `run` method should always return output given in constructor.
 */

interface Process<in A, out B> {
    fun run(input: A): B
}

class EchoProcess<T> : Process<T, T> {
    override fun run(input: T): T = input
}

class ShredProcess<in A> : Process<A, Unit> {
    override fun run(input: A) {
        if (!input.toString().contains("TOP SECRET")) {
            throw IllegalArgumentException()
        }
    }
}

class EventStreamProcess<out B>(private val output: B) : Process<Unit, B> {
    override fun run(input: Unit): B = output
}
