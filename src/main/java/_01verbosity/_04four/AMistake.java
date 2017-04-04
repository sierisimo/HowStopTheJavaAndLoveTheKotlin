package _01verbosity._04four;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by sierisimo on 4/3/17.
 */
public class AMistake {
    public static void main(String[] args) {
        List<String> listOfNames = new LinkedList<>();
        listOfNames.add(null);
        listOfNames.add("Foo");
        listOfNames.add(null);
        listOfNames.add("Bar");
        listOfNames.add(null);
        listOfNames.add("Baz");

        for(String name : listOfNames){
            System.out.println(name.length()); //<-- The Billion Dollar Mistake.
            // Sorry... NullPointerException. I always mixed them up.
        }
    }
}
