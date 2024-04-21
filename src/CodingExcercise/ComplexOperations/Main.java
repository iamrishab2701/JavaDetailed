package CodingExcercise.ComplexOperations;

public class Main {

    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(0.0,-3.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(0,0);
        System.out.println("one.real = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
    }
}
