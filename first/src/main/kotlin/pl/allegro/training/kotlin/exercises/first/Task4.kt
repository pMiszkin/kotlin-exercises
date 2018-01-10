package pl.allegro.training.kotlin.exercises.first

/**
 * Create the implementation of the `TextFiles` object so that the following calls should work:
 * * `val text = TextFiles["abc.txt"]` - `text` should contain the contents of file _abc.txt_ as a `String` or
 *     `null` if the file does not exist
 * * `TextFiles["abc.txt"] = "Hello"` - the _abc.txt_ file should now contain "Hello"
 * * `TextFiles["abc.txt"] = null` - the _abc.txt_ should be removed if it exists; otherwise do nothing
 */

object TextFiles
