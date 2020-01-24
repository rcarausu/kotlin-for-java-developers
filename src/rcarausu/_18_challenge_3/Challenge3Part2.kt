package rcarausu._18_challenge_3

import rcarausu.javacode.RoadBike

/*
 * Challenge 1: Add a main function and create an instance of all bikes and call the printDescription function
 * Challenge 2: Make the gear parameter optional in the KotlinBicycle class and also in the subclasses
 * Challenge 2: Companion object for KotlinBicycle with availableColors list and method to print it
 */

fun main() {
    val bicycle = KotlinBicycle(3, speed = 10)
    val mountainBike = KotlinMountainBike(2, 3, speed =10)
    val roadBike = KotlinRoadBike(5, 3, speed = 10)

    bicycle.printDescription()
    mountainBike.printDescription()
    roadBike.printDescription()

    val mountainBike2 = KotlinMountainBike(10, 10, speed = 10, color = "Blue")
    mountainBike2.printDescription()

    KotlinMountainBike.availableColors.forEach {println(it)}
}