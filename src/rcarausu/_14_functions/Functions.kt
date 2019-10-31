package rcarausu._14_functions

fun main() {
    println(labelMultiply(3, 4, "The result is :"))
    println(labelMultiply(label = "The result is :", op2 = 3, op1 = 4))

    val emp = Employee("Jane")
    println(emp.upperCaseFirstName())

    val car1 = Car("blue", "Toyota", 2015)
    val car2 = Car("red", "Ford", 2016)
    val car3 = Car("gray", "Ford", 2017)

    // If the varargs is at the end we could avoid using a named parameter
    printColors(car1, car2, car3, str = "Color: ")

    val manyCars = arrayOf(car1, car2, car3)

    // spread operator (*) unpacks the array to be used as vararg parameter
    printColors(*manyCars, str = "Color: ")
    printColors(*manyCars, car3, str = "")
}

fun labelMultiply(op1: Int, op2: Int, label: String) = "$label ${op1 * op2}"

// only 1 vararg parameter in a function signature
fun printColors (vararg cars: Car, str: String) {
    for (car in cars) {
        println("$str${car.color}")
    }
}

class Employee(private val firstName: String) {

    // public and final by default
    fun upperCaseFirstName() = firstName.toUpperCase()

}

data class Car(val color: String, val model: String, val year: Int) {

}