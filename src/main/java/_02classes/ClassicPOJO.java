package _02classes;

import java.math.BigInteger;
import java.util.List;

/**
 * And from times to times, you use POJO as you holder, because it is best suited for
 * have on collections, or to convert to more complex data.
 *
 * Most modern IDEs (let's be honest, Eclipse and Jetbrains owns this spots) allows you
 * to create this classes faster, adding the hashcode almost magically or adding features
 * like annotations and constructors on the fly.
 *
 * Why not have a more... "readable" way?
 */
public class ClassicPOJO {
    private List<String> keys;
    private String hashKey;
    private BigInteger totalCount;

    public ClassicPOJO(){}

    public ClassicPOJO(List<String> keys, String hashKey, BigInteger totalCount) {
        this.keys = keys;
        this.hashKey = hashKey;
        this.totalCount = totalCount;
    }

    public List<String> getKeys() {
        return keys;
    }

    public void setKeys(List<String> keys) {
        this.keys = keys;
    }

    public String getHashKey() {
        return hashKey;
    }

    public void setHashKey(String hashKey) {
        this.hashKey = hashKey;
    }

    public BigInteger getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(BigInteger totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClassicPOJO that = (ClassicPOJO) o;

        if (!getKeys().equals(that.getKeys())) return false;
        if (!getHashKey().equals(that.getHashKey())) return false;
        return getTotalCount().equals(that.getTotalCount());
    }

    @Override
    public int hashCode() {
        int result = getKeys().hashCode();
        result = 31 * result + getHashKey().hashCode();
        result = 31 * result + getTotalCount().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "ClassicPOJO{" +
                "keys=" + keys +
                ", hashKey='" + hashKey + '\'' +
                ", totalCount=" + totalCount +
                '}';
    }
}
