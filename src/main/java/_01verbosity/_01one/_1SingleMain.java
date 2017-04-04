package _01verbosity._01one;

/**
 * A single main, expressed as normally it coul be.
 *
 * As you can see, you have to wrap it around a class, even when you don't actually use this class
 * to create objects or to operate on other class.
 */
public class _1SingleMain {
    public static void main(String[] args) {
        String name = "Sier";
        int value = 1;
        long version = 1032938475L;

        ASingleClass aSingle = new ASingleClass(name, value, version);
    }
}
