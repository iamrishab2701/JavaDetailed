package CodingExcercise.ReverseArray;

import java.util.Arrays;

public class ReverseArrayExercise {

    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};
        reverse(array);
    }

    private static void reverse(int[] array) {
        System.out.println("Array = " + Arrays.toString(array));
        int temp;
        int maxLimit = array.length - 1;
        int halfLimit = array.length / 2;
        for (int i = 0; i < halfLimit; i++) {
            temp = array[i];
            array[i] = array[maxLimit - i];
            array[maxLimit - i] = temp;
        }
        System.out.println("Reversed Array = " + Arrays.toString(array));
    }
}
