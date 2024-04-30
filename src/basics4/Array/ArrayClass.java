package basics4.Array;

import java.util.Arrays;
import java.util.Random;

public class ArrayClass {

    public static void main(String[] args) {
        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray); // This will sort the array elements.
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5); // All Values will be 5
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));

        int[] smallerArray = Arrays.copyOf(thirdArray, 5); // Creating copy of an array with smaller length
        System.out.println(Arrays.toString(smallerArray));

        int[] largeArray = Arrays.copyOf(thirdArray, 15);  // Creating copy of an array with bigger length then the copied array.
        System.out.println(Arrays.toString(largeArray));

        int[] minAndMaxArray = getRandomArray(15);
        System.out.println(Arrays.toString(minAndMaxArray));
        Arrays.sort(minAndMaxArray);
        System.out.println("Min value is " + minAndMaxArray[0] + " and Max value is " + minAndMaxArray[minAndMaxArray.length - 1]);


    }

    private static int[] getRandomArray(int length) {
        Random random = new Random();
        int[] newInt = new int[length];

        for (int i = 0; i < length; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
