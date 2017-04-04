package _01verbosity._03three;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by sierisimo on 4/3/17.
 */
public class _1HardWorkerTest {
    @Test
    public void checkWorkersExist() {
        _1HardWorker aHardWorker = getPreparedHardworker();
        assertTrue("Size should be bigger than 0", aHardWorker.getSubworkersTotal() > 0);
    }

    @Test
    public void checkWorkersAreValid() {
        _1HardWorker aHardWorker = getPreparedHardworker();
        aHardWorker.validateWorkers();

        assertNotNull("Check we still have subworkers", aHardWorker.getSubworkersTotal());
        assertNotEquals("Check subworkers are there", 0, aHardWorker.getSubworkersTotal());
    }

    private _1HardWorker getPreparedHardworker() {
        _1HardWorker aHardWorker = new _1HardWorker();
        aHardWorker.fillListUserNames(getMockNames());

        return aHardWorker;
    }

    private List<String> getMockNames() {
        List<String> mocks = new LinkedList<>();
        mocks.add("Sier");
        mocks.add("Ernesto");
        mocks.add("Orlando");
        mocks.add("Dionicio");
        mocks.add("Miriam");
        mocks.add("Paco");
        mocks.add("Rafa");
        mocks.add("Ivan");
        mocks.add("Emma");
        mocks.add("Christian");

        return mocks;
    }
}