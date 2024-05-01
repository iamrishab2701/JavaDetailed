package Challenge.ArrayChallenge.ReverseArrayChallenge;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] simpleArray = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(reverseCopy(simpleArray)));
    }

    private static int[] reverse(int[] array) { //Mutating Method
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
            System.out.println("--------->" + Arrays.toString(array));
        }

        return array;
    }

    // Another Approach
    private static int[] reverseCopy(int[] array) {
        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;
        for (int ele : array) {
            reversedArray[maxIndex--] = ele;
        }
        return reversedArray;
    }
}
