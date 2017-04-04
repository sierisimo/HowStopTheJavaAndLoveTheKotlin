package _01verbosity._03three;

import java.util.List;

/**
 * Created by sierisimo on 4/3/17.
 */
public class CollectionAccident {
    public void checkNamesAndRemoveDuplicates(List<String> namesList){
        //Code...

        //But suddenly... a mistake!!
        namesList.clear();
    }
}
