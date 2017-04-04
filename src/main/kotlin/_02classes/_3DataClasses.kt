package _02classes

import java.io.Serializable
import java.math.BigInteger

/**
 * Kotlin achieve this kind of "holders" and classes using a special feature called
 * data classes.
 * This data classes allows you to define in a simpler way classes that need to have
 * data and common methods and using default implementation:
 */
data class Pojo(val keysList: List<String>, val hashKey: String, val totalCount: BigInteger)

/**
 * But as this are still classes... you can add what you want to them
 */
data class Control(val id: Long) : Serializable {
    constructor() : this(-1)

    fun navigate() {}
}

/**
 * And this "Data classes" could be used without problem as regular classes.
 */
fun addToCollection(collection: MutableCollection<Pojo>) {
    val pojo = Pojo(listOf(),"asdf", BigInteger("1000"))

    collection.add(pojo)

    println(pojo.hashCode())
    println(pojo)
}