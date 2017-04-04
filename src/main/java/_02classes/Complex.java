package _02classes;

public class Complex {
    public final double real;
    public final double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     * The common complain about this, is that you have to rewrite
     * every method when you need multiple / optional parameters.
     */
    public Complex add(double realPart) {
        return add(realPart, imaginary);
    }

    public Complex add(double real, double imaginary) {
        return new Complex(this.real + real, this.imaginary + imaginary);
    }

    public Complex substract(double realPart) {
        return substract(realPart, imaginary);
    }

    public Complex substract(double real, double imaginary) {
        return new Complex(this.real - real, this.imaginary - imaginary);
    }
}
