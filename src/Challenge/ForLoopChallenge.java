package Challenge;

public class ForLoopChallenge {
    public static void main(String[] args) {

        /*
         * Create a prime number counter variable, that will keep count of how many
         * prime numbers were found.
         *
         * Create a for statement, using any range of numbers, where the maximum number
         * is <= 1000.
         *
         * For each number in the range:
         *
         * Check to see if it's a prime number using the isPrime method.
         *
         * If the number is prime, print it out and increment the prime number counter
         * variable.
         *
         * Once the prime number counter equals three, exit the loop(Hint, use the break
         * statement to exit).
         *
         */

        int count = 0;
        for (int num = 0; num < 3 && num <= 20; num++) {
            if (isPrime(num)) {
                System.out.println(num + " is Prime Number");
                count++;
            } else {
                System.out.println(num + " is not Prime");
            }
        }
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
