package _01verbosity._02two

/**
 * You can use the match operator (called "when") to check for some... cases...
 * Yes, it's like a switch-case but it allows different behaviors...
 */
fun matchThemAll(x: Number) {
    val listOfIrrationals = irrationals()
    //... more code...
    when (x) {
        in listOfIrrationals -> operateOn(x)
        in -100..0, in -500..-2000 -> println("Not like a number I want...")
        !in 0..100 -> println("It isn't qualified :(")
        0, 1 -> println("That joke about 10 kind of people...")
        is Int, is Long, is Double -> doSomeMath(x)
        else -> {
            println("Something went wrong with that number...")
        }
    }

    /**
     * Also, if you "return" values from your matches, you can store it!
     * This allows you that the last value found on a match, will be the
     * assigned value for your variable!
     * When using this feature, you have to always give a "else" part in
     * your match.
     */
    val y = when(listOfIrrationals.size){
        0 -> ":("
        1 -> listOfIrrationals[0]
        in 10..100 -> 100
        else -> Any()
    }
}