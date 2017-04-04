package _01verbosity._02two

import _01verbosity._02two._1streams.Stream
import java.io.BufferedInputStream
import java.io.BufferedOutputStream
import java.io.InputStream
import java.io.OutputStream

fun getCallback(): Callback = object : Callback {}

fun getBufferedInputStream(): BufferedInputStream = BufferedInputStream(getInputStream())

fun getInputStream(): InputStream = object : InputStream() {
    override fun read(): Int = 0
}

fun getBufferedOutputStream(): BufferedOutputStream = BufferedOutputStream(getOutputStream())

fun getOutputStream(): OutputStream = object : OutputStream() {
    override fun write(b: Int) {}
}

fun workWithStream(stream: Stream) {}