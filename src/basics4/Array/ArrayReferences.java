package basics4.Array;

import java.util.Arrays;

public class ArrayReferences {

    public static void main(String[] args) {

        int[] myIntArray = new int[5]; // Reference Type
        int[] anotherArray = myIntArray;
        modifyArray(myIntArray);

        anotherArray[0] = 1;
        System.out.println("after change myIntArray " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {
        array[1] = 2;
    }
}