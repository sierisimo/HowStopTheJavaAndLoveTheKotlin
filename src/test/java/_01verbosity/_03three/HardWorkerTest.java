package _01verbosity._03three;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by sierisimo on 4/3/17.
 */
public class HardWorkerTest {
    @Test
    public void checkWorkersExist() {
        HardWorker hardWorker = getPreparedHardworker();
        assertTrue("Size should be bigger than 0", hardWorker.getSubworkersTotal() > 0);
    }

    @Test
    public void checkWorkersAreValid() {
        HardWorker hardWorker = getPreparedHardworker();
        hardWorker.validateWorkers();

        assertNotNull("Check we still have subworkers", hardWorker.getSubworkersTotal());
        assertNotEquals("Check subworkers are there", 0, hardWorker.getSubworkersTotal());
    }

    private HardWorker getPreparedHardworker() {
        HardWorker hardWorker = new HardWorker();
        hardWorker.fillListUserNames(getMockNames());

        return hardWorker;
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