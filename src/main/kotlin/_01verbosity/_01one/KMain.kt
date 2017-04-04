package _01verbosity._01one

import _01verbosity._01one.ASingleClass

/**
 * Kotlin gives you the `val` keyword, that helps to define when you are creating
 * a link between a value and a name (a variable).
 *
 * Also, you can notice the missing type definition, kotlin compiler tries to infer which
 * type has a variable once it's assigned.
 */
fun main(args: Array<String>) {
    val name = "Sier"
    val value = 1
    val version = 1032938475L

    // Kotlin also removes the "new" keyword. And semicolons.
    val aSingle = ASingleClass(name, value, version)

    //If you still want to be explicit or is it mandatory to
    //be explicit, you can do it!
    val list: List<String> = listOf("Let's", "do", "it", "in", "kotlin!")
}