package rcarausu._01_declarations

// aliases for types that we can use in the file
// Can be imported in another files
typealias ldt = java.time.LocalDateTime

fun main(args: Array<String>) {
    val names = arrayListOf("John", "Tim", "Mary")

   names.forEachIndexed{index, name ->
    val person = Person(name, index)
       println(person)
   }

    names.forEach{name -> println(name)}

    println(names[1]) // lists can be accessed with brackets

    val person = Person("Tim", 1)
    person.name = "John"
    // can't re-assign val variables or fields
    // person.id = 2
    // person = Person("John", 2)

    var reassignablePerson = Person("John", 2)
    reassignablePerson = person // this is allowed

    println(ldt.now())
    println(reassignablePerson.name)
}

data class Person(var name: String, val id: Int)