package _01verbosity._03three;

import java.util.LinkedList;
import java.util.List;

/**
 * Let's imagine that we have a class that contains its own
 * list of subworkers, let's say just the names.
 */
public class _1HardWorker {
    private List<String> listOfSubworkers;

    public _1HardWorker() {
        listOfSubworkers = new LinkedList<>();
    }

    public void fillListUserNames(List<String> userNames) {
        listOfSubworkers.addAll(userNames);
    }

    /**
     * And for some reason, a method needs to validate names with another class
     */
    public void validateWorkers(){
        _2CollectionAccident collectionAccident = new _2CollectionAccident();
        //But what does this method do?
        collectionAccident.checkNamesAndRemoveDuplicates(listOfSubworkers);
    }

    public int getSubworkersTotal(){
        return listOfSubworkers.size();
    }
}
