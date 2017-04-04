package _01verbosity._04four

import _01verbosity._03three.User

/**
 * Let's see how the "fix" for THE ONE BILLION DOLLAR MISTAKE: NullPointers
 * is implemented in Kotlin...
 */
fun dealWithThem() {
    var name = "Sinuhe"
    var user: User? = User(1, name) // << You have to specify when something is nullable.
    // Work with the name...
    storeName(name)
    // Some more work and then...
    if (today() < 0) {
        //name = null //<--Won't compile... because name isn't nullable.
        user = null // No problemo, because you specified is: User?
    }

    //And for now, you have to specify every time you use you variable:
    user?.logout() //But that's good, kotlin skip this if variable turns to be null, not showing NPE

    //And for collections...
    val listOfNames = listOf("Sinuhe", "Ada", "Brenda")
    val listOfNoNames = listOf<String?>(null, null, null)
    //OR
    val listOfNulls: List<String?> = listOf(null, null)

    /**
     * But kotlin allows you to work as you want, just tell the code to work even when you know
     * something can go wrong...
     */
    val firstNoName = listOfNoNames[0]!! //Ensure to get a NPE if something fails.
}
