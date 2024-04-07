package CodingExcercise;

public class PositiveNegativeZero {

    /*
     * The objective of this coding exercise is to create a simple program that can
     * check whether a number is positive, negative or zero
     * 
     * Write a method called checkNumber with an int parameter name number
     * 
     * The method should not return any value, and it needs to printout:
     * 
     * - "positive" if the parameter number is > 0
     * - "negative" if the paramter number is < 0
     * - "zero" if the parameter number is equal to 0
     * 
     * NOTE - only write the method logic don't create a main method
     */

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }

}
