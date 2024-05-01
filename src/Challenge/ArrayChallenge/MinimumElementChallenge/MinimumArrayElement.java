package Challenge.ArrayChallenge.MinimumElementChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumArrayElement {

    public static void main(String[] args) {

        int[] userArray = readIntegers(5);
        System.out.println(Arrays.toString(userArray));
        int minElement = findMin(userArray);
        System.out.println("Minimum element is " + minElement);

    }


    private static int[] readIntegers(int length) {
        Scanner scanner = new Scanner(System.in);
        int[] integerArray = new int[length];
        System.out.println("Enter numbers");
        for (int i = 0; i < length; i++) {
            integerArray[i] = scanner.nextInt();
        }
        return integerArray;
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
