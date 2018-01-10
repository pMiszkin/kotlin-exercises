package pl.allegro.training.kotlin.exercises.third

/**
 * Define a `scoreSorted` extension function on `List<Customer>` which takes as an argument
 * a scoring function (which takes a `Customer` as an argument and returns an `Int`) and returns
 * a `List<Customer>` sorted according to scoring.
 *
 * Define a val with the name `scorer` which holds a scoring function with the following scoring algorithm:
 * if (income < 100_000) 0 points
 * else +1 point for every 10_000 income above 100_000 (e.g. 1 point for 115_000)
 * +
 * if (age < 18) 0 points
 * else + 1 point if 18 <= age < 25
 *      + 2 points if 25 <= age < 35
 *      + 3 point if 35 <= age < 50
 *      + 2 points if 50 <= age < 65
 *      + 1 point if 65 <= age
 */

data class Customer(
    val id: String,
    val income: Int,
    val age: Int
)

