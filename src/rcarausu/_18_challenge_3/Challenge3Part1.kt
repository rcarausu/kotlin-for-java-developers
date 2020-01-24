package rcarausu._18_challenge_3

/*
 * Challenge 1: Convert the Java Bicycle class to Kotlin
 * Challenge 2: Convert the Java MountainBike class to Kotlin
 * Challenge 3: Convert the Java RoadBike class to Kotlin
 */

open class KotlinBicycle(var cadence: Int, var gear: Int = 10, var speed: Int) {
    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() {
        println("Bike is in gear $gear with a cadence of $cadence travelling at a speed of $speed")
    }

}

class KotlinMountainBike(var seatHeight: Int, cadence: Int, gear: Int = 10, speed: Int) : KotlinBicycle(cadence, gear, speed) {

    constructor(seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10, color: String) :
            this(seatHeight, cadence, speed, gear) {
        println("This is the $color mountain bike")
    }

    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has a seat height of $seatHeight inches.")
    }

    companion object {
        val availableColors: List<String> = listOf("blue", "red", "white", "black", "green", "brown")
    }
}

class KotlinRoadBike(val tireWidth: Int, cadence: Int, gear: Int = 10, speed: Int) : KotlinBicycle(cadence, gear, speed) {
    override fun printDescription() {
        super.printDescription()
        println("The road bike has a seat height of $tireWidth millimetres.")
    }
}
