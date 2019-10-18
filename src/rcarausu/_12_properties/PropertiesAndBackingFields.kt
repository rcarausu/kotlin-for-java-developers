package rcarausu._12_properties

fun main() {

    // For public properties in Kotlin you get getters and setters
    val emp = Employee("John")
    emp.fullTime = false
    println(emp.firstName)
    println(emp.fullTime)

    val emp2 = Employee2("Mat", false)
    // In Kotlin getter and setters must have the same visibility as the property,
    // or a more restrictive one, so private properties have private getters and setters
    // emp2.fullTime = true // won't work

    val emp3 = Employee3("Jane", true)
    println(emp3.fullTime)
    emp3.fullTime = false

}

class Employee(val firstName: String, var fullTime: Boolean = true)

class Employee2(val firstName: String, private var fullTime: Boolean = true)

// without the declaration (var or val) Kotlin doesn't generate the code
// for the property
class Employee3(val firstName: String, fullTime: Boolean = true) {

    // Custom getters or setters must be written IMMEDIATELY after the
    // property declaration
    var fullTime = fullTime // at this point default getters and setters are declared
    get() {
        println("Running the custom get")
        return field
    }
    set(value) {
        println("Running the custom set")
        field = value
    }

}

