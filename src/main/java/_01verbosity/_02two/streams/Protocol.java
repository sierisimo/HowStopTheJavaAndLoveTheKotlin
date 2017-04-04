package _01verbosity._02two.streams;

/**
 * Created by sierisimo on 3/31/17.
 */
public enum Protocol {
    TCP("TCP"), UDP("UDP");

    Protocol(String name){
        this.name = name;
    }

    public String name;
}
