package _02classes

import java.math.BigInteger

/**
 * Kotlin achieve this kind of "holders" and classes using a special feature called
 * data classes.
 * This data classes allows you to define in a simpler way classes that need to have
 * data and common methods and using default implementation:
 */
data class Pojo(val keysList: List<String>, val hashKey: String, val totalCount: BigInteger)