package rcarausu._25_lambdas_with_receivers

fun main(args: Array<String>) {

    println(countTo100())


    val employees = listOf(
            Employee("John", "Smith", 2012),
            Employee("Jane", "Wilson", 2015),
            Employee("Mary", "Johnson", 2010),
            Employee("Mike", "Jones", 2002)
    )

    findByLastName(employees, "Wilson")
    findByLastName(employees, "Foreman")

    "Some string".apply someString@ {
        "Another string".apply {
            println(toLowerCase()) // this works for 'Another string', same as 'this.toLowercase()'
            println(this@someString.toUpperCase()) // we can use labels for nested applies and withs
        }
    }
}


fun findByLastName(employees: List<Employee>, lastName: String) {
    // employees.forEach returnBlock@ { --> label for a local return
    employees.forEach {
        if (it.lastName == lastName) {
            println("Yes, there's an employee with the last name $lastName")
            return // this return returns from the main function, not only from the forEach lambda, otherwise
            // the last println statement would be executed also.
            // If we want to return only from the forEach, we need to use a 'label'
            //return@returnBlock --> local return
        }
    }
    println("No, there's no employee with the last name $lastName")
}

fun countTo100() =
        // 'apply' is like 'with' but returns the receiver and it's applied to the instance, it doesn't uses it as a parameter
        StringBuilder().apply {
            for (i in 1..99) {
                append(i)
                append(", ")
            }
            append(100)
        }.toString()

//fun countTo100() =
//        // 'with' converts the instance that we pass through into a 'receiver' of the lambda,
//        // then we can use member functions of it
//        // similar of calling with 'this.', but we don't need to use it
//        with(StringBuilder()) {
//            for (i in 1..99) {
//                append(i)
//                append(", ")
//            }
//            append(100)
//            toString()
//        }


//fun countTo100(): String {
//    val numbers = StringBuilder()
//    for (i in 1..99) {
//        numbers.append(i)
//        numbers.append(", ")
//    }
//    numbers.append(100)
//    return numbers.toString()
//}

data class Employee(val firstName: String, val lastName: String, val startYear: Int)
