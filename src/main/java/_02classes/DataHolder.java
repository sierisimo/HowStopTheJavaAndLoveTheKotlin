package _02classes;

import java.util.Set;

/**
 * From time to time you need to create a "holder" for data, let's say, somewhere
 * you can store data and pass it around in a easier way.
 */
public final class DataHolder {
    public final String key;
    public final long version;
    public final Set<Double> prices;

    public DataHolder(String key, long version, Set<Double> prices) {
        this.key = key;
        this.version = version;
        this.prices = prices;
    }
}
