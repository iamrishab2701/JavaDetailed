package Challenge;

public class WhileLoopChallenge {

    public static void main(String[] args) {

        /*
         * So Step 1 is to create a method called isEvenNumber, that takes a paramter of
         * type int.
         * Its purpose is to determine if the argument passed to the method is an even
         * number or not.
         * Return true from the method, if it's an even number, otherwise return false.
         * 
         * Next, use a while loop to test a range of numbers, from 5, up to and
         * including 20, but printing out only the even numbers, determined by the call
         * to the iSEveNumber method.
         * 
         * So, Step 2 is to modify the while code
         * 
         * Make it also record the total number of even numbers it has found.
         * Break out of the loop, once 5 even numbers are found.
         * 
         * Finally display the total numbers of odd and even numbers found.
         * 
         */

        int number = 5;
        int evenCount = 0;
        int oddCount = 0;
        while (number <= 20) {
            if (isEvenNumber(number)) {
                System.out.println(number);
                evenCount++;
                if (evenCount >= 5) {
                    break;
                }
            }
            if (!isEvenNumber(number)) {
                oddCount++;
            }
            number++;
        }
        System.out.println("Total even numbers " + evenCount);
        System.out.println("Total count of odd numbers " + oddCount);
    }

    public static boolean isEvenNumber(int param1) {
        if ((param1 % 2) == 0) {
            return true;
        } else {
            return false;

        }
    }
}