package _01verbosity._03three;

import java.util.List;

/**
 * And this class exists to help... but... has a big mistake.
 */
public class _2CollectionAccident {
    public void checkNamesAndRemoveDuplicates(List<String> namesList){
        //Code...

        //But suddenly... a mistake!!
        namesList.clear();
    }
}
