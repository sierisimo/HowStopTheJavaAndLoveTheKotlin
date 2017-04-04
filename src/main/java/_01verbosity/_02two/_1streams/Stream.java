package _01verbosity._02two._1streams;

public interface Stream {
    void close();
    void copyTo(Stream stream);
    void copyTo(Stream stream, int buffer);
    void flush();
    int read(byte[] bytes, int offset, int count);
    int write(byte[] bytes, int offset, int count);
}
