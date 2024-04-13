package basics;

public class ForLoop {

    public static void main(String[] args) {

        for (int counter = 0; counter <= 5; counter++) {
            System.out.println(counter);
        }

        for (double interestRate = 1.0; interestRate < 10; interestRate++) {
            double interestAmount = calculateInterest(10000.0, interestRate);
            System.out.println("10,000 at " + interestRate + " % interest = " + interestAmount);
        }

        // Mini Challenge

        /*
         * Using a new for statement, call the calculateInterest method with the dollar
         * amount of 100
         * And this time, use the interest rates between 7.5 and 10, but increment by a
         * quarter of a percent each time, meaning 0.25 percent.
         * And print the results to the console window.
         */

        for (double interestRate = 7.5; interestRate <= 10; interestRate += 0.25) {
            double interestAmount = calculateInterest(100, interestRate);
            if (interestAmount > 8.5) {
                break;
            }
            System.out.println("100 at " + interestRate + " % interest = " + interestAmount);
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
