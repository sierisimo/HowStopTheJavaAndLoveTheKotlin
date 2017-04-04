package _01verbosity._02two

import _01verbosity._02two._1streams.*

/**
 * The common way in java to achieve a casting is to cast on demand or
 * store in a reference the "casted" value. Is common to see methods that
 * contains the classic if-else way around checking for "instanceof" in every case
 * and then, inside you do a cast and work with it.
 */
fun ifCheckData(stream: Stream) {
    if (stream is FileStream) {
        val file = stream.createFile("Sier")
        //... lots of code
    } else if (stream is NetworkStream) {
        stream.setProtocol(Protocol.UDP)
                .setTimeout(1090100)
                .readAsync(byteArrayOf(), 2, 3, getCallback())
    } else if (stream is BufferedStream) {
        stream.setBufferInput(getBufferedInputStream())
                .setBufferOutput(getBufferedOutputStream())
                .read(byteArrayOf(), 0, 0)
    } else {
        workWithStream(stream)
    }
}

/**
 * But... Kotlin tries to avoid the common casting process of if-else using
 * a match operator that once founds the type or founds a match creates
 * a block where you can use your object as the one matched. Access
 * properties, access methods, get returning values and similar operations.
 */
fun fetchData(stream: Stream) {
    when (stream) {
        is FileStream -> {
            val file = stream.createFile("Sier")
            //do something with file
            //... more code ...
            stream.flush()
        }
        is NetworkStream ->
            stream.setProtocol(Protocol.TCP)
                    .setTimeout(10000000)
                    .readAsync(byteArrayOf(), 0, 0, getCallback())
        is BufferedStream -> stream.setBufferInput(getBufferedInputStream())
                .setBufferOutput(getBufferedOutputStream())
                .read(byteArrayOf(), 0, 0)
        else -> workWithStream(stream)
    }

    /**
     * This only applies to casting, you still can use a "explicit" casting, that kotlin
     * consider "unsafe":
     */
    (stream as NetworkStream).setTimeout(10000).setProtocol(Protocol.UDP)
}