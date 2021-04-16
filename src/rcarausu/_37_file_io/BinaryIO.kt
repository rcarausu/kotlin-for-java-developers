package rcarausu._37_file_io

import java.io.DataInputStream
import java.io.EOFException
import java.io.FileInputStream

fun main() {
    val di = DataInputStream(FileInputStream("src/rcarausu/_37_file_io/text_file.txt"))
    var si: String

    try {
        while (true) {
            si = di.readUTF()
            println(si)
        }
    } catch (e: EOFException) {

    }
}