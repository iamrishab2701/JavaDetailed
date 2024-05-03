package basics4.ArrayList;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayAndArrayList {

    public static void main(String[] args) {

        String[] originalArray = {"First", "Second", "Third"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0, "One"); // This effects the source Array as well.
        System.out.println(originalList);
        System.out.println(Arrays.toString(originalArray)); // Same output as List

        originalList.sort(Comparator.naturalOrder());
        System.out.println(Arrays.toString(originalArray));

        originalList.add("first");
    }
}
