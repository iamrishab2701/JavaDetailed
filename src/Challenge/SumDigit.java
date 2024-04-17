package Challenge;

public class SumDigit {

    public static void main(String[] args) {

        /*
         * In this challenge, your task is to write a method, with the name sumDigit,
         * thas has a single parameter named number, of type int, and it should return
         * an int.
         *
         * The method should only take a number that is a positive number.
         *
         * If a negative number is passed, it should return -1, meaning an invalid value
         * was passed.
         *
         * The method should parse out each digit from the number, and sum the digit up.
         *
         * So if 125 is the value passed to the method, the code should sum each digit,
         * in this case, 1 + 2 + 5, and return 8, as a value.
         *
         * And another example, if the value is 1000, the code should sum each digit,
         * 1+0+0+0, and return 1 as a value.
         *
         * If the number is a single digit number, simply return the number itself as
         * the result
         */

        System.out.println(sumDigit(1234));
    }

    public static int sumDigit(int number) {
        int sum = 0;
        if (number < 0) {
            return -1;
        } else if ((number < 10 && number > 1)) {
            return number;
        } else {
            while (number != 0) {
                sum += (number % 10);
                number /= 10;
            }
            return sum;
        }
    }
}