package rcarausu._35_generics_contravariance

fun main(args: Array<String>) {

    val flowerTender = object : FlowerCare<Flower> {
        override fun prune(flower: Flower) = println("I'm tending a ${flower.name}")
    }

//    val roseTender = object : FlowerCare<Rose> {
//        override fun prune(flower: Rose) = println("I'm pruning a rose!")
//    }

    val roseGarden = Garden<Rose>(listOf(Rose(), Rose()), flowerTender)
    roseGarden.tendFlower(0)

//    val daffodilTender = object : FlowerCare<Daffodil> {
//        override fun prune(flower: Daffodil) = println("I'm pruning a daffodil")
//    }

    val daffodilGarden = Garden<Daffodil>(listOf(Daffodil(), Daffodil(), Daffodil()), flowerTender)

    daffodilGarden.tendFlower(2)
}

class Garden<T : Flower>(val flowers: List<T>, val flowerCare: FlowerCare<T>) {
    fun pickFlower(i: Int) = flowers[i]
    fun tendFlower(i: Int) {
        flowerCare.prune(flowers[i])
    }
}

open class Flower(val name: String) {

}

class Rose : Flower("Rose") {

}

class Daffodil : Flower("Daffodil") {

}

// We apply contravariance by adding 'in' before the type.
// That is, we accept any type that have T in their inheritance tree (subclasses of T).
interface FlowerCare<in T> {
    fun prune(flower: T)
//    fun pick(): T // No we can' do this, it's the opposite of covariance
}