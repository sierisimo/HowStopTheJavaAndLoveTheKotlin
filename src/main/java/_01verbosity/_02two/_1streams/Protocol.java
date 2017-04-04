package _01verbosity._02two._1streams;

public enum Protocol {
    TCP("TCP"), UDP("UDP");

    Protocol(String name){
        this.name = name;
    }

    public String name;
}
