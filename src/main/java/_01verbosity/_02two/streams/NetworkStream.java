package _01verbosity._02two.streams;

import _01verbosity._02two.Callback;

/**
 * Created by sierisimo on 3/31/17.
 */
public class NetworkStream implements AsyncStream {
    @Override
    public void close() {

    }

    @Override
    public void copyTo(Stream stream) {

    }

    @Override
    public void copyToAsync(Stream stream) {

    }

    @Override
    public void copyTo(Stream stream, int buffer) {

    }

    @Override
    public void copyToAsync(Stream stream, int buffer) {

    }

    @Override
    public void flush() {

    }

    @Override
    public void flushAsync() {

    }

    @Override
    public int read(byte[] bytes, int offset, int count) {
        return 0;
    }

    @Override
    public void readAsync(byte[] bytes, int offset, int cound, Callback callback) {

    }

    @Override
    public int write(byte[] bytes, int offset, int count) {
        return 0;
    }

    @Override
    public void writeAsync(byte[] bytes, int offset, int count, Callback callback) {

    }

    public NetworkStream setProtocol(Protocol protocol) {
        return this;
    }

    public NetworkStream setTimeout(long timeout) {
        return this;
    }
}
