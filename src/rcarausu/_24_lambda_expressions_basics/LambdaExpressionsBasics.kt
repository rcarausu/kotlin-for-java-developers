package rcarausu._24_lambda_expressions_basics

fun main(args: Array<String>) {
    //run {println("I'm in a lambda!")}

    val employees = listOf(Employee("John", "Smith", 2012),
            Employee("Jane", "Wilson", 2015),
            Employee("Mary", "Johnson", 2010),
            Employee("Mike", "Jones", 2002)
    )

    println(employees.minBy { it.startYear })
    println(employees.minBy(Employee::startYear))
    // Other way -> println(employees.minBy { e -> e.startYear })
    // If compiler can't infer the type --> println(employees.minBy { e: Employee -> e.startYear })

//    var num = 10
//    run {
//        num += 15
//        println(num)
//    }

    // Top level functions can be called inside lambdas with double collon but without any arguments
    run(::topLevel)

}

fun topLevel() = println("I'm a function!")

fun useParameter(employees: List<Employee>, num: Int) {
    employees.forEach {
        println(it.firstName)
        println(num)
    }
}

data class Employee(val firstName: String, val lastName: String, val startYear: Int)
