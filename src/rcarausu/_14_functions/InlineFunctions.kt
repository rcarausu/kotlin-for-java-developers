package rcarausu._14_functions

fun main() {

}

// Inlining works best for functions with lambda parameters
// This is so to avoid the requirement of creating a class and an object under the covers
inline fun labelMultiply2(op1: Int, op2: Int, label: String) = "$label ${op1 * op2}"
