package CodingExcercise;

public class LastDigitChecker {

    public static void main(String[] args) {

        /*
         * Last Digit Checker
         * Write a method named hasSameLastDigit with three parameters of type int.
         *
         * Each number should be within the range of 10 (inclusive) - 1000 (inclusive).
         * If one of the numbers is not within the range, the method should return
         * false.
         *
         * The method should return true if at least two of the numbers share the same
         * rightmost digit; otherwise, it should return false.
         *
         *
         *
         * EXAMPLE INPUT/OUTPUT:
         *
         * hasSameLastDigit (41, 22, 71); → should return true since 1 is the rightmost
         * digit in numbers 41 and 71
         *
         * hasSameLastDigit (23, 32, 42); → should return true since 2 is the rightmost
         * digit in numbers 32 and 42
         *
         * hasSameLastDigit (9, 99, 999); → should return false since 9 is not within
         * the range of 10-1000
         *
         *
         *
         * Write another method named isValid with one parameter of type int.
         *
         * The method needs to return true if the number parameter is in range of
         * 10(inclusive) - 1000(inclusive), otherwise return false.
         *
         * EXAMPLE INPUT/OUTPUT
         *
         * isValid(10); → should return true since 10 is within the range of 10-1000
         *
         * isValid(468); → should return true since 468 is within the range of 10-1000
         *
         * isValid(1051); → should return false since 1051 is not within the range of
         * 10-1000
         *
         *
         *
         * NOTE: All methods need to be defined as public static as we have been doing
         * so far in the course.
         *
         * NOTE: Do not add a main method to the solution code.
         *
         * The objective of this coding exercise is to write a small program that checks
         * if at least two of the numbers have the same rightmost digit.
         */

        System.out.println(hasSameLastDigit(11, 99, 999));
    }

    public static boolean isValid(int number) {
        if (number < 10 || number > 1000) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        } else if ((num1 % 10 == num2 % 10) || (num2 % 10 == num3 % 10) || (num3 % 10 == num1 % 10)) {
            return true;
        } else {
            return false;
        }
    }

}
