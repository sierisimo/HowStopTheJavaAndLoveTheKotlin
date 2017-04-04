package _01verbosity._02two._1streams;

import _01verbosity._02two.Callback;

public interface AsyncStream extends Stream {
    void copyToAsync(Stream stream);

    void copyToAsync(Stream stream, int buffer);

    void flushAsync();

    void readAsync(byte[] bytes, int offset, int cound, Callback callback);

    void writeAsync(byte[] bytes, int offset, int count, Callback callback);
}
