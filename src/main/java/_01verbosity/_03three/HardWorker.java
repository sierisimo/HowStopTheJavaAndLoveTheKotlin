package _01verbosity._03three;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by sierisimo on 4/3/17.
 */
public class HardWorker {
    private List<String> listOfSubworkers;

    public HardWorker() {
        listOfSubworkers = new LinkedList<>();
    }

    public void fillListUserNames(List<String> userNames) {
        listOfSubworkers.addAll(userNames);
    }

    public void validateWorkers(){
        CollectionAccident collectionAccident = new CollectionAccident();
        collectionAccident.checkNamesAndRemoveDuplicates(listOfSubworkers);
    }

    public int getSubworkersTotal(){
        return listOfSubworkers.size();
    }
}
