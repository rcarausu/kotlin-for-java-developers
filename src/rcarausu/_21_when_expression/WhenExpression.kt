package rcarausu._21_when_expression

import java.math.BigDecimal

enum class Season {
    SPRING, SUMMER, FALL, WINTER
}

fun main() {
    val timeOfYear = Season.WINTER
    val str = when (timeOfYear) {
        Season.SPRING -> "Spring"
        Season.SUMMER -> "Summer"
        Season.FALL -> "Fall"
        Season.WINTER -> "Winter"
    }

    println(str)

    val num = 200
    val x = 30
    when (num) {
        100, x + 70 -> println("100")
        200, 300 -> println("200")
        in 500..1000 -> println("in ragen 500..1000")
        else -> println("Doesn't match anything")
    }

    // smart casting
    val obj: Any = "string"
    val obj2: Any = BigDecimal(25.2)
    val obj3: Any = 45
    val something: Any = obj2

    val z = when (something) {
        is String -> println(something.toUpperCase())
        is BigDecimal -> println(something.remainder(BigDecimal(10.5)))
        is Int -> println("${something - 22}")
        else -> println("Type of $something not known")
    }

    val num1 = 1
    val num2 = 2
    when {
        num1 > num2 -> println("Greater")
        num1 < num2 -> println("Lower")
        else -> println("Equal")
    }

}