package rcarausu._15_inheritance

fun main() {
    val laserPrinter = LaserPrinter("Brother 1234", 15)
    laserPrinter.printModel()
}

// If not abstract class needs to be open for extension
// since everything in Kotlin is public and final
//open class Printer(val modelName: String)
abstract class Printer(val modelName: String) {

    open fun printModel() = println("The model name of this printer is $modelName")
    abstract fun bestSellingPrice(): Double

}


// Extension
open class LaserPrinter(modelName: String, ppm: Int): Printer(modelName) {

    override fun printModel() = println("The model name of this laser printer is $modelName")
    final override fun bestSellingPrice(): Double = 129.99

}

class SpecializedLaserPrinter(modelName: String, ppm: Int): LaserPrinter(modelName, ppm) {

    override fun printModel() = println("this is my way of doing it")
//    Can't be overridden because of the final keyword in the super class
//    override fun bestSellingPrice(): Double = 299.99
}

// If a super class has a secondary constructor, it can't be called
// by a subclass because every constructor must delegate to the primary
// constructor
// It only makes sense if there is no primary constructor

open class Something {
    val someProperty: String

    constructor(someParameter: String) {
        someProperty = someParameter
        println("I'm in the parent's constructor")
    }
}

class SomethingElse: Something {

    constructor(someOtherParameter: String): super(someOtherParameter) {
        println("I'm in the child's constructor")
    }
}

// Data classes are closed type and cannot be extended, abstract or inner classes
// They can extend other classes but that's all
data class DataClass(val number: Int) {

}
