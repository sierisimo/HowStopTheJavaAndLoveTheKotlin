package _02classes;

/**
 * Created by sierisimo on 4/4/17.
 */
public class Complex {
    public final double real;
    public final double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

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
