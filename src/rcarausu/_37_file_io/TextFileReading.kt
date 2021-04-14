package rcarausu._37_file_io

import java.io.File

fun main() {
    val reader = File("src/rcarausu/_37_file_io/text_file.txt").reader()

    // readLines() closes stream. It also reads all the file at once so it should not be used with big files
//    val lines = reader.readLines()
//    lines.forEach { println(it) }

//    println(reader.readText())
//    reader.close()

    // use closes the resource correctly whether it throws an Exception or not
//    val lines = reader.use { it.readText() }
//    println(lines)


    // This only reads one line at a time and it closes the reader for us
    reader.forEachLine { println(it) }
}
