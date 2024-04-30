package CodingExcercise.SortedArray;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        int[] finalArray = getIntegers(5);
        printArray(finalArray);
        int[] sortedArray = sortInteger(finalArray);
        System.out.println(Arrays.toString(sortedArray));
    }

    public static int[] getIntegers(int capacity) {
        Scanner scanner = new Scanner(System.in);
        int[] newArray = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for (int i = 0; i < capacity; i++) {
            newArray[i] = scanner.nextInt();
        }
        return newArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortInteger(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        int temp;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
