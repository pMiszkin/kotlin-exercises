package com.allegro.training.kotlin.exercises.second

import java.math.BigDecimal

/**
 * Use [let], [run], [with], [apply] or [also] in implementations of the following functions.
 */

/**
 * Use [BigDecimal] constructor here.
 */
fun String?.asBigDecimal(): BigDecimal? = TODO()

/**
 * Use [UserBuilder] here. Create two different implementations.
 */
fun createUser1(firstName: String, lastName: String): User = TODO()

fun createUser2(firstName: String, lastName: String): User = TODO()

/**
 * Use [userService] here. After getting a user [log] it and then return it.
 */
fun getUser(lastName: String): User = TODO()

/**
 * Initialize (call [LoggingService.init]) before returning it.
 */
fun createLoggingService(prefix: String): LoggingService = TODO()

/*----------------------------------------------------------------------*/
data class User(
    val firstName: String,
    val lastName: String,
    val sex: Sex
)

class UserBuilder {
    private var firstName: String = "John"
    private var lastName: String = "Doe"
    private var sex: Sex = Sex.MALE

    fun setFirstName(firstName: String) {
        this.firstName = firstName
    }

    fun setLastName(lastName: String) {
        this.lastName = lastName
    }

    fun setSex(sex: Sex) {
        this.sex = sex;
    }

    fun build(): User = User(firstName, lastName, sex)
}

private val userService = UserService()

class UserService {
    fun getUser(lastName: String): User = createUser1("John", lastName)
}

enum class Sex {
    MALE, FEMALE
}

val logs = mutableListOf<String>()

fun log(msg: String) {
    println(msg)
    logs += msg
}