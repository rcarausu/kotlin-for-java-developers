package rcarausu._09_challenge_2

fun main() {
    // 1. Declare a non-nullable float variable two ways
    // and assign it the value -3847.384.
    val float1 = -2.5f
    val float2 = -2.5.toFloat()

    // 2. Now change both of those variable declarations into nullable variables.
    val float3: Float? = -2.5f
    val float4: Float? = -2.5.toFloat()

    // 3. Declare an array of type non-nullable Short. Make it size 5,
    // and assign it the values 1, 2, 3, 4, 5.
    val shortArray1 = shortArrayOf(1, 2, 3, 4, 5)
    val shortArray2: Array<Short> = arrayOf(1, 2, 3, 4, 5)

    // 4. Declare an array of nullable Ints and initialize it with the values 5, 10, 15 .. to 200
    val intArray = Array<Int?>(40) {i -> i + 5}
    val intArray2:Array<Int?> = Array(40) {i -> (i + 1) * 5}

    // 5.
    val charArray = charArrayOf('a', 'b', 'c')

    // 6.
    val x: String? = "I AM IN UPPERCASE"
    val y = x?.toLowerCase() ?: "I give up!"
    println(y)

    // 7.
    val s: String? = "I AM ROBERT"
    s?.let { println(it.toLowerCase().replace("am", "am not")) }

    // 8.
    val myNonNullVariable: Int? = null
    myNonNullVariable!!.toDouble()
}