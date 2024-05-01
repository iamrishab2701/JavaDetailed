package Challenge.ArrayChallenge.MinimumElementChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumArrayElement {

    public static void main(String[] args) {

        int[] userArray = readIntegers();
        System.out.println(Arrays.toString(userArray));
        int minElement = findMin(userArray);
        System.out.println("Minimum element is " + minElement);

    }


    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for(int i = 0; i < splits.length; i++){
            values[i] = Integer.parseInt(splits[i].trim());
        }
        return values;
    }

    private static int findMin(int[] array) {
        // Two ways to find minimum value in an array
        // First Way
        int min;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    min = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = min;
                    flag = true;
                }
            }
        }

        // Second Way
        /*Arrays.sort(array);*/
        return array[0];
    }
}
