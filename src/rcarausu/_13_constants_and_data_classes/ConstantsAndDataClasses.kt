package rcarausu._13_constants_and_data_classes

val MY_CONSTANT = 100

fun main() {
    println(MY_CONSTANT)

    val car = Car("blue", "Toyota", 2015)
    val car2 = Car("blue", "Toyota", 2015)
    val car3 = car.copy()
    val car4 = car.copy(year = 2016, color = "green")

    println(car) // in-built toString method
    println(car == car2) // in-built equalsAndHashCode, for a non-data class it would return false
    println(car3)
    println(car4)

}

// Data Class
// We get some free functions
// toString(), equalsAndHashCode(), copy()
// They can be overwritten
// Data classes can't be abstract, sealed or inner classes
data class Car(val color: String, val model: String, val year: Int) {

}