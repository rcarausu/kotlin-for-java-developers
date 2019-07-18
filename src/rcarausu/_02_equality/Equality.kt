package rcarausu._02_equality

fun main() {
    // In java == checks for reference equality, and .equals checks for structural equality

    val personOne = Person("Tim", 1)
    val personTwo = Person("Rob", 2)
    val personThree = Person("Tim", 1)

    // in Kotlin .equals defaults to == operator, which checks structural equality
    // for reference equality, we need to use the === operator
    println(personOne == personTwo)
    println(personTwo == personTwo)
    println(personOne.equals(personThree))
    println(personTwo.equals(personThree))
    println(personOne === personThree)

}

class Person(var name: String, val id: Int) {

    override fun equals(other: Any?): Boolean {
        if (other is Person) {
            return name == other.name && id == other.id
        }
        return false
    }
}
