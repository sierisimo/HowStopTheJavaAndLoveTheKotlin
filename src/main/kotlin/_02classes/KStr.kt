package _02classes

/**
 * And let's imagine that you have a library, or maybe a project with full classes...
 * and you need/want to add an operation on some object, but you cannot add new functionality
 * to a class, or maybe you have a library and are unsure if you can extend from a class...
 * or simply you can't because the class is final, then you'll create a new class and add a static
 * method that returns a new copy of the object or maybe modifies it's state...
 *
 * Why not have a way to create this functionality for all objects and use it in a natural way?
 */
fun String.reverse(): String = this.reversed()

val cache = mutableListOf("",
        " ",
        "  ",
        "   ",
        "    ",
        "     ")

/**
 * This are called, extension functions, and they help to add functionality to existent classes
 * and use this functionality like it's part of the original object.
 */
fun String.leftpad(size: Int, char: String = " " /*`char` defaults to `' '`*/): String {
    // `len` is the `pad`'s length now
    var len: Int = size - length

    if (len > 0) {
        return if (char == " " && len < cache.size) {
            // cache common use cases
            cache[len] + this
        } else if (char == " " && len > cache.size) {
            // If len is not cached, put it on the cache
            while (len >= cache.size) cache.add(cache[cache.size - 1] + " ")

            // now a cache common use case
            cache[len] + this
        } else {
            // `pad` starts with an empty string
            var pad = ""

            // mutable string
            var ch = char

            while (true) {
                // add `ch` to `pad` if `len` is odd
                if (len % 2 == 1) {
                    pad += ch
                }

                // divide `len` by 2, ditch the remainder
                len /= 2
                if (len > 0) {
                    // "double" the `ch` so this operation count grows logarithmically on `len`
                    // each time `ch` is "doubled", the `len` would need to be "doubled" too
                    // similar to finding a value in binary search tree, hence O(log(n))
                    ch += ch
                } else break  // `len` is 0, exit the loop
            }

            // return the new created string
            pad + this
        }
    } else {
        // doesn't need to pad
        return this
    }
}

/**
 * From now, all your variables of type X has access to this new functions.
 * No need to use extra classes or modify existing ones.
 */
fun main(args: Array<String>) {
    val name = "Sinuhe Jaime"

    println(name.leftpad(20, ">"))
    println(name.reverse())
    println(name.leftpad(30))
}