package rcarausu._20_if_expression

fun main() {
    // In Kotlin, the if can evaluate to a value, this is the main difference with Java
    val someCondition = 69 < 22
    val num = if(someCondition) 50 else 592
    val num2 = if (someCondition) {
        println("something")
        50
    } else {
        println("something else")
        592
    }

    println(num2)

}