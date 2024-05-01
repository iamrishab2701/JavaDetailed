package CodingExcercise.MinimumElement;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {
        System.out.println(findMin(readElements(readInteger())));
    }

    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        return count;
    }

    public static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number : ");
            int number = scanner.nextInt();
            array[i] = number;
        }
        return array;
    }

    public static int findMin(int[] array) {
        Arrays.sort(array);
        return array[0];
    }
}