package _01verbosity._01one;

/**
 * Created by sierisimo on 3/29/17.
 */
public class ASingleClass {
    private String attribute;
    private int value;
    private long versionId;

    public ASingleClass(String attribute) {
        this.attribute = attribute;
    }

    public ASingleClass(int value) {
        this.value = value;
    }

    public ASingleClass(long versionId) {
        this.versionId = versionId;
    }

    public ASingleClass(String attribute, int value) {
        this.attribute = attribute;
        this.value = value;
    }

    public ASingleClass(String attribute, int value, long versionId) {
        this.attribute = attribute;
        this.value = value;
        this.versionId = versionId;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public long getVersionId() {
        return versionId;
    }

    public void setVersionId(long versionId) {
        this.versionId = versionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ASingleClass that = (ASingleClass) o;

        if (getValue() != that.getValue()) return false;
        if (getVersionId() != that.getVersionId()) return false;
        return getAttribute() != null ? getAttribute().equals(that.getAttribute()) : that.getAttribute() == null;
    }

    @Override
    public int hashCode() {
        int result = getAttribute() != null ? getAttribute().hashCode() : 0;
        result = 31 * result + getValue();
        result = 31 * result + (int) (getVersionId() ^ (getVersionId() >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "ASingleClass{" +
                "attribute='" + attribute + '\'' +
                ", value=" + value +
                ", versionId=" + versionId +
                '}';
    }
}