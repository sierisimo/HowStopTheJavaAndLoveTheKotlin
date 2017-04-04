package _01verbosity._02two;

import _01verbosity._02two._1streams.*;

import java.io.*;

/**
 * This is the common Java way to work when you don't know a subtype or
 * implementation.
 */
public class _2MainStreams {
    public static void fetchData(Stream stream) {
        if (stream instanceof FileStream) {
            FileStream fStream = (FileStream) stream;
            File file = fStream.createFile("Sier");
            //... more code.
        } else if (stream instanceof BufferedStream) {
            ((BufferedStream) stream)
                    .setBufferInput(getBufferedInputStream())
                    .setBufferOutput(getBufferedOutputStream());
        } else if (stream instanceof NetworkStream) {
            ((NetworkStream) stream).setProtocol(Protocol.TCP)
                    .flushAsync();
        }
    }

    public static BufferedInputStream getBufferedInputStream() {
        return new BufferedInputStream(getInputStream());
    }

    static InputStream getInputStream() {
        return new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };
    }

    public static BufferedOutputStream getBufferedOutputStream() {
        return new BufferedOutputStream(getOutputStream());
    }

    public static OutputStream getOutputStream() {
        return new OutputStream() {
            @Override
            public void write(int b) throws IOException {

            }
        };
    }
}
