package rcarausu._04_strings

fun main() {

    val person = Person("Tim", 2)
    println(person)

    val total = 10
    val change = 4.22

    println("\$change: $change") // escaping the dollar symbol
    println("division of $total by $change is: ${total / change}")

    println("Person name is ${person.name}")

}

class Person(var name: String, val id: Int) {

    override fun toString(): String {
        return "Person(name='$name', id=$id)"
    }
}