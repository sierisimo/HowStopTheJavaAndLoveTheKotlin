package _02classes

/**
 * Usually you create a full class hierarchy of classes and dependencies, of interfaces and
 * inheritance, you create Factories and use design patterns that looks awesome...
 * But what if... you just need/want a useful operation on some object or maybe a logger
 * place, maybe a place that returns you the version... You don't want to have a full class
 * to hold only static methods that only works as "Util" class.
 *
 * Kotlin decided to go functional and help to fix this, you need a small operation? Use a function
 */
fun doSomeCoolStuff() {
    // Cool code goes here.
}

/**
 * functions are individuals, but inside classes they are methods.
 * And sometimes this methods/functions need to operate over possibilities, like:
 * "What if someone don't send you a value but you still want the same name?"
 *
 * Then you end creating the same method multiple times.
 * Kotlin adds default values.
 */
class KComplex(val real: Double, val imaginary: Double) {
    fun add(real: Double = 0.0, imaginary: Double = 0.0): KComplex {
        return KComplex(this.real + real, this.imaginary + imaginary)
    }
}

/**
 * And talking about functions and defaults... why not named parameters?
 *
 * Kotlin will put order to this, so being explicit on declaration helps the future usage.
 */
fun addComplex() {
    val kComplexOne = KComplex(1.0, 1.0)
    val kComplexNoI = KComplex(imaginary = 0.0, real = 1.0)

    val totalComplex = kComplexOne.add(imaginary = 2.0, real = 3.1)
}