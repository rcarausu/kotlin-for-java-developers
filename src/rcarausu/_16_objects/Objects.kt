package rcarausu._16_objects

import java.time.Year

fun main(args: Array<String>) {

    println(Department.ACCOUNTING.getDeptInfo())

    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())
    SomeClass.Companion.accessPrivateVar()
    SomeClass2.SomeCompanion.accessPrivateVar()

    val someClass1 = SomeClass.justAssign("this is the string as is")
    val someClass2 = SomeClass.upperOrLowerCase("this isn't the string as is", false)

    println(someClass1.someString)
    println(someClass2.someString)

    // The third use of object is for creating anonymous objects (object expressions)
    wantsSomeInterface(object : SomeInterface {
        override fun mustImplement(num: Int): String =
            "This is from mustImplement: ${num * 100}"
    })
}

enum class Department(val fullName: String, val numEmployees: Int) {
    HR("Huan Resources", 5),
    IT("Information Technology", 10),
    ACCOUNTING("Accounting", 3),
    SALES("Sales", 20);

    // Adding functions to enums is the one exception to semicolons are optional rule

    fun getDeptInfo() = "The $fullName department has $numEmployees employees"
}

// The first use case of the 'object' keyword is for creating singletons
object CompanyCommunications {

    private val currentYear = Year.now().value

    fun getTagLine() = "Our company rocks!"
    fun getCopyrightLine() = "Copyright \u00A9 $currentYear Our Company. All rights reserved."

}

fun topLevel(str: String) {
    println("Top level function says $str")
}

// The second use os for creating companion classes
class SomeClass(val someString: String) {
//    val someString: String
//
//    constructor(str: String) {
//        someString = str
//    }
//
//    constructor(str: String, lowerCase: Boolean) {
//        someString = if (lowerCase) {
//            str.toLowerCase()
//        } else {
//            str.toUpperCase()
//        }
//    }

    companion object {
        private val privateVar = 6

        fun accessPrivateVar() = println("I'm accessing privateVar: $privateVar")

        fun justAssign(str: String) = SomeClass(str)
        fun upperOrLowerCase(str: String, lowerCase: Boolean): SomeClass {
            return if (lowerCase) {
                SomeClass(str.toLowerCase())
            } else {
                SomeClass(str.toUpperCase())
            }
        }
    }
}

class SomeClass2 {
    companion object SomeCompanion {
        private val privateVar = 6

        fun accessPrivateVar() = println("I'm accessing privateVar: $privateVar")
    }
}

interface SomeInterface {
    fun mustImplement(num: Int): String
}

fun wantsSomeInterface(si: SomeInterface) {
    println("Printing from wantsSomeInterface ${si.mustImplement(22)}")
}
