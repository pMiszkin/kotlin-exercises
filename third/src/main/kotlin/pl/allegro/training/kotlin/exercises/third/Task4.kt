package pl.allegro.training.kotlin.exercises.third

/**
 * Make the constructor of [Person] class private and provide a factory function
 * `create(firstName: String, lastName: String): Person` in companion object.
 */

class Person private constructor(
    val firstName: String,
    val lastName: String
) {
    companion object {
        fun create(firstName: String, lastName: String) = Person(firstName, lastName)
    }
}