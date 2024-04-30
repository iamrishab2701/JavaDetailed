package basics4.Array;

import java.util.Arrays;
import java.util.Random;

public class ArrayBinary {

    public static void main(String[] args) {
        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Mark") >= 0) {
            System.out.println("Found Mark in the list");
        }

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {5, 2, 3, 4, 1};

        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }

    public static int[] getRandomArray(int length) {
        Random random = new Random();
        int[] intArray = new int[length];
        for (int i = 0; i < length; i++) {
            intArray[i] = random.nextInt();
        }
        return intArray;
    }
}
