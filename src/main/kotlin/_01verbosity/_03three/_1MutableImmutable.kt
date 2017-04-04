package _01verbosity._03three

/**
 * A common problem that java has is the mutability of objects and how you can pass them around
 * and do some damage to process that you think wouldn't affect. Maybe the most notable example of this
 * kind of errors is visible in collections. You pass a collection and suddenly a method/class uses
 * `collection.clear()` or replaces an element...
 *
 * Kotlin achieve safety on this, extending and creating own collections that remain immutable once created
 * and only are available for reading.
 */
val listOfUsers = listOf(User(1, "Sier"), User(2, "Lalo"))
val userOne = listOfUsers[0] // <- Valid, only read

fun addUser(user: User) {
    //listOfUsers.add(user) //<-- Won't compile, collection is immutable.
    //listOfUsers.clear() //<-- also won't compile... lucky us.
}

/**
 * But it also provides with common collections that are mutable, but you have to specify it.
 */
val listForNewUsers = mutableListOf(User(2, "Ernesto"), User(3, "Dani"))

fun appendUser(user: User) {
    listForNewUsers.add(User(4, "Orlando"))
}
