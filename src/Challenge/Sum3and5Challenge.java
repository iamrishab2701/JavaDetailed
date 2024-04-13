package Challenge;

public class Sum3and5Challenge {

    public static void main(String[] args) {
        /*
         * Create a for loop using a range of numbers from 1 to 1000 inclusive
         * 
         * Sum all the numbers that can be divided by both 3 and 5
         * 
         * Print out the numbers that have met the above conditions.
         * 
         * Break out of the loop once you have found 5 numbers that met the conditions
         * above.
         * 
         * After breaking out of the loop, print the sum of the numbers that met the
         * conditions above.
         * 
         * Note" type all the code in main method
         */

        int count = 0;
        int sum = 0;
        for (int num = 1; num <= 1000; num++) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("Number which is divisble by 3 and 5 is " + num);
                sum += num;
                count++;
                if (count == 5) {
                    break;
                }
            }
        }
        System.out.println("Some of numbers is :" + sum);
    }

}
