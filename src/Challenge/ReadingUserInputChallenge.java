package Challenge;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    /*
     * In this challenge, you'll read 5 valid numbers from the console, entered by the user and print the sum of those five numbers.
     *
     * You'll want to check that the numbers entered, are valid Integers.
     *
     * If not print out the message "Invalid Number" to the console, but continue looping, until you do have 5 valid numbers.
     *
     * Before the user enters each number, prompt them with the message, "Enter number #x:", where x represents the count, 1,2,3, etc.
     *
     * And as an example there, the first message would look something like, Enter number #1, the next "Enter number #2:" and so on.
     * */

    public static void main(String[] args) {
        sumOfRealIntegers();
    }

    public static void sumOfRealIntegers() {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int i = 1;
        do {
            System.out.println("Enter number #" + i + ":");
            String value = scanner.nextLine();
            try {
                double number = Double.parseDouble(value);
                i++;
                sum += number;
            } catch (NumberFormatException badEnteredValue) {
                System.out.println("Please enter valid Integer value");
            }
        } while (i <= 5);
        System.out.println("Total sum is :" + sum);
    }
}