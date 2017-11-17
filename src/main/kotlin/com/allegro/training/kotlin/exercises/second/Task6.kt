package com.allegro.training.kotlin.exercises.second

private val CARS = listOf("Ford Fiesta", "Ford Mondeo", "Ford Mustang", "BMW X5", "BMW X6", "Fiat 126p")

/**
 * Implement functions according to their name/description.
  */

// Sorted by brand name.
fun getBrands(): List<String> = TODO()

fun getBrandSet(): Set<String> = TODO()

// Sorted by brand name.
fun getBrandArray(): Array<String> = TODO()

// Sorted by brand name.
fun getBrandIterable(): Iterable<String> = TODO()

// Sorted by brand name.
fun  getMutableBrands(): MutableList<String> = TODO()

fun getModels(): Set<String> = TODO()

// Sorted by brand name, then model name.
fun getCars(): List<Car> = TODO()

/** See [associateBy] */
fun getModelMap(): Map<String, Car> = TODO()

/** See [groupBy] */
fun getCarBrandMap(): Map<String, List<Car>> = TODO()

/** See [flatMap] */
fun getAllModels (carBrandMap: Map<String, List<Car>>): Set<String> = TODO()

/**
 * All Ford model names which start with M.
 */
fun getFordsMModels(): Set<String> = TODO()

data class Car(
    val brand: String,
    val model: String
)
