package rcarausu._23_challenge_4

fun main(args: Array<String>) {
    // 1. Use a range to print the numbers from 5 to 5000
//    for (i in 5..5000 step 5) {
//        println(i)
//    }

    // 2. Use a range to rint the numbers from -500 to 0
//    for (i in -500..0) {
//        println(i)
//    }

    // 3. Print the first 15 numbers of the Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8
//    var aux1 = 0
//    var aux2 = 1
//    for (i in 0..15) {
//        if (i == 0 || i == 1) {
//            println(i)
//        } else {
//            val sum = aux2 + aux1
//            println(sum)
//            aux1 = aux2
//            aux2 = sum
//        }
//    }

    // 4. Change the following code to get the output: 1, 11, 100, 99, 98, 2
    /*
    for (i in 1..5) {
            println(i)
        for (j in 11..20) {
            println(j)
            for (k in 100 downTo 90) {
                println(k)
            }
        }
    }
     */
    iloop@ for (i in 1..5) {
        println(i)
        if (i == 2) {
            break
        }
        for (j in 11..20) {
            println(j)
            for (k in 100 downTo 90) {
                println(k)
                if (k == 98) {
                    continue@iloop
                }
            }
        }
    }

    // 5. Declare a variable called num (int) and assign it whatever you want.
    // Declare a variable called dnum (double) and assignit as follows:
    // if num > 100, assign dnum -234.567
    // if num < 100, assign dnum 4444.555
    // if num == 100, assign dnum 0.0
    // do all of the above in one statement/expression
    // Then print the value of dnum - separate statement
    val num = 200
    val dnum = if (num > 100) -234.567 else if (num < 100) 444.55 else 0.0
    println(dnum)

    // Other option
    val dnum2 = when {
        num > 100 -> -234.567
        num < 100 -> 4444.555
        else -> 0.0
    }
    println(dnum2)

}