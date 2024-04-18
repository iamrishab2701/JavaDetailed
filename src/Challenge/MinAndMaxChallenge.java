package Challenge;

import java.util.Scanner;

public class MinAndMaxChallenge {

    /*
     * You'll be using an endless loop which:
     *
     * Prompts the user to enter a number, or any character to quit
     *
     * Validates if the user-entered data really is a number, you can choose either integer, or double validation method.
     *
     * If the user-entered data is not a number, quit the loop.
     *
     * Keep track of the minimum number entered.
     *
     * Keep track of the maximum number entered.
     *
     * If the user has previously entered a set of numbers (or even just one), display the minimum, and maximum number, which the user entered.
     * */

    public static void main(String[] args) {
        minAndMax();
    }

    public static void minAndMax() {
        Scanner scanner = new Scanner(System.in);
        double previousValue = 0;
        double currentValue = 0;
        do {
            previousValue = currentValue;
            System.out.println("Enter the number ");
            String numberString = scanner.nextLine();
            try {
                currentValue = Double.parseDouble(numberString);
                if (currentValue < previousValue) {
                    System.out.println("MIN Value is " + currentValue + " and MAX Value is " + previousValue);
                } else if(currentValue == previousValue){
                    System.out.println("Quiting the loop as Previous and Current Value are same");
                }else{
                    System.out.println("MIN Value is " + previousValue + " and MAX Value is " + currentValue);
                }
            } catch (NumberFormatException badValue) {
                System.out.println("Invalid Value Entered");
                break;
            }
        } while (currentValue != previousValue);
    }
}
