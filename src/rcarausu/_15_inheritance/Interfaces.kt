package rcarausu._15_inheritance

fun main() {

}

interface MyInterface {

    val number: Int
//    val number2:Int = 50 // Can't use property initialized in interfaces for concrete properties
    val number2: Int //
        get() = number * 100 // concrete properties can be defined via a custom getter

    fun myFunction(str: String): String

}

interface MySubInterface: MyInterface {

    fun mySubFunction(num: Int): String

}

abstract class Printer2(val modelName: String) {

    open fun printModel() = println("The model name of this printer is $modelName")
    abstract fun bestSellingPrice(): Double

}


// Extension
open class LaserPrinter2(modelName: String, ppm: Int): Printer(modelName), MyInterface {

    override val number: Int = 25

    override fun myFunction(str: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun printModel() = println("The model name of this laser printer is $modelName")
    final override fun bestSellingPrice(): Double = 129.99

}

open class SomeClass: MySubInterface {

    override val number: Int = 25

    override fun myFunction(str: String): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun mySubFunction(num: Int): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    val someProperty: String

    constructor(someParameter: String) {
        someProperty = someParameter
        println("I'm in the parent's constructor")
    }
}


