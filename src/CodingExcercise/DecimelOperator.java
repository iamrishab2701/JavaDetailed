package CodingExcercise;

public class DecimelOperator {

    /*
     * DecimalComparator
     * Write a method areEqualByThreeDecimalPlaces with two parameters of type
     * double.
     *
     * The method should return boolean and it needs to return true if two double
     * numbers are the same up to three decimal places. Otherwise, return false.
     *
     *
     *
     * EXAMPLES OF INPUT/OUTPUT:
     *
     * areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since
     * numbers are equal up to 3 decimal places.
     *
     * areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since
     * numbers are not equal up to 3 decimal places
     *
     * areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers
     * are equal up to 3 decimal places.
     *
     * areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since
     * numbers are not equal up to 3 decimal places.
     *
     *
     *
     * TIP: Use paper and pencil.
     *
     * TIP: Use casting.
     *
     * NOTE: The areEqualByThreeDecimalPlaces method needs to be defined as public
     * static ​like we have been doing so far in the course.
     * NOTE: Do not add a main method to solution code.
     *
     * The objective of this coding exercise is to write a small program that
     * determines if two numbers are equal, up to three decimal places.
     */

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(0.003, 0.003));
    }

    public static boolean areEqualByThreeDecimalPlaces(double param1, double param2) {
        int param1ToInt = (int) (param1 * 1000);
        int param2ToInt = (int) (param2 * 1000);
        return param1ToInt == param2ToInt;
    }

}
