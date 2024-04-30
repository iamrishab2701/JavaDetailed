package Challenge.ArrayChallenge;

import java.util.Arrays;
import java.util.Random;

public class ArrayDesc {

    public static void main(String[] args) {
        int[] intArray = randomIntArray(10);
        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));


    }

    public static int[] randomIntArray(int length) {
        Random random = new Random();
        int[] ar = new int[length];
        for(int i = 0;i< length ; i++){
            ar[i] = random.nextInt(100);
        }
        return ar;
    }
}
