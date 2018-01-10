package pl.allegro.training.kotlin.exercises.third

import kotlin.streams.toList

/**
 * Create the implementation of the constructor so that it reads words from a _words.txt_ resource file
 * and puts into into `words` field.
 *
 * Handy information:
 * * to get resource as [java.net.URI] you can use `javaClass.classLoader.getResource()` method
 * * use [use] extension function on streams
 * * use [java.io.InputStream.bufferedReader] extension function on stream to get [java.io.BufferedReader]
 * * use [java.util.stream.Stream.toList] extension function to get a list out of a [java.util.stream.Stream]
 * * use [kotlin.collections.Iterable.toSet] extension function to convert a list to a [kotlin.collections.Set]
 */

private const val WORDS_RESOURCE = "words.txt"

class WordSet {
    private val words: Set<String> = TODO()

    operator fun contains(word: String): Boolean = word in words
}