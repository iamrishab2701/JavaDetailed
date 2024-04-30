package Challenge.ArrayChallenge;

import java.util.Arrays;
import java.util.Random;

public class ArrayDesc {

    public static void main(String[] args) {
        int[] unsortedArray = randomIntArray(5);
        System.out.println(Arrays.toString(unsortedArray));
        int[] sortedArray = sortIntegers(new int[]{7, 30, 35});
        System.out.println(Arrays.toString(sortedArray));

    }

    public static int[] randomIntArray(int length) {
        Random random = new Random();
        int[] ar = new int[length];
        for (int i = 0; i < length; i++) {
            ar[i] = random.nextInt(1000);
        }
        return ar;
    }

    private static int[] sortIntegers(int[] array) {
        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                    System.out.println("--------> " + Arrays.toString(sortedArray));
                }
            }
            System.out.println("-----------> " + Arrays.toString(sortedArray));
        }
        return sortedArray;
    }
}
