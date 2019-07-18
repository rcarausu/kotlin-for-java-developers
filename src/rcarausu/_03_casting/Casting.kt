package rcarausu._03_casting

fun main() {
    val something: Any = Person("Tim", 1)

    if (something is Person) {
        println("$something is of type Person")
    }
}

class Person(var name: String, val id: Int)