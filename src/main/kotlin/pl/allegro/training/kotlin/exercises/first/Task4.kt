package pl.allegro.training.kotlin.exercises.first

import java.nio.file.Files
import java.nio.file.Paths

/**
 * Create the implementation of the `TextFiles` object so that the following calls should work:
 * * `val text = TextFiles["abc.txt"]` - `text` should contain the contents of file _abc.txt_ as a `String` or
 *     `null` if the file does not exist
 * * `TextFiles["abc.txt"] = "Hello"` - the _abc.txt_ file should now contain "Hello"
 * * `TextFiles["abc.txt"] = null` - the _abc.txt_ should be removed if it exists; otherwise do nothing
 */

object TextFiles {
    operator fun get(name: String): String? =
        try {
            String(Files.readAllBytes(Paths.get(name)), Charsets.UTF_8)
        } catch (e: java.nio.file.NoSuchFileException) {
            null
        }

    operator fun set(name: String, content: String?) =
        if (content != null) {
            Files.write(Paths.get(name), content.toByteArray(Charsets.UTF_8))
        } else {
            Files.deleteIfExists(Paths.get(name))
        }
}
