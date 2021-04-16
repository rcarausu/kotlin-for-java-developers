package rcarausu._37_file_io

import java.io.File

fun main() {
    File("/etc/dexma").walkTopDown()
        .filter {it.name.endsWith(".conf")}
        .forEach { println(it) }
}