package rcarausu._17_imports

import rcarausu._16_objects.topLevel
import rcarausu._16_objects.CompanyCommunications as cc

// Kotlin doesn't complain about having files in a different package
// But the recommended way is the Java one where packages match the directory structure
fun main() {
    topLevel("Hello from another file")
    println(cc.getCopyrightLine())
}