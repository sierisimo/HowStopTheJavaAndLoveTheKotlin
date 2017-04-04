package _01verbosity._03three

/**
 * In general you will try to pass objects around trying to modify the minimum of the state of the object.
 * Also, you'll try to create copies to avoid memory leaks or keep the current object available for other
 * classes.
 *
 * In general, you want to keep the objects in the state they went created and just modify your current local
 * copy of the object.
 *
 * That's why kotlin sets by default all classes to be `final` and allows you to use `val` and `var`
 * to denote when a variable is readonly or is mutable.
 */
class Reminder

class Complex(val real: Number, val imaginary: Number)
//class MoreComplex(r: Number, i: Number) : Complex(real, imaginary) // <-- Won't compile, class Complex is final

/**
 * Most of why `final` is good for most cases is explained in `Effective Java`
 * But let's stay with:
 *
 * - Immutable objects are simple
 * - Not only can you share immutable objects, but you can share their internals.
 * - Classes should be immutable unless there’s a very good reason to make them mutable.
 *
 * And the most interesting: `Design and document for inheritance or else prohibit it`
 *
 * with this in mind, you have to specify always when a class is `open` for inheritance.
 */
open class Bycicle
