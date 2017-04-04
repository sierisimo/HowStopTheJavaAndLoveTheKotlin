package _02classes;

/**
 * Generally, you use this kind of class to help you creating tools and utilities
 * for getting values.
 */
public class StringUtil {

    /**
     * Avoid creating objects from this class... because it's a utility class.
     */
    private StringUtil(){}

    /**
     * And your methods end being static functions, that takes a parameter
     * and do the operations you want.
     */
    public static String reverse(String s) {
        String[] chars = s.split("");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString();
    }

    /*
     * This isn't wrong... but doesn't feel natural.
     */
}
