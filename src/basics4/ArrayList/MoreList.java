package basics4.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreList {
    public static void main(String[] args) {

        String[] items = {"apple", "banana", "mango", "milk", "eggs"};

        List<String> list = List.of(items);
        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("Yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(List.of("pickles", "musturd", "cheese"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        System.out.println("Third Item  = " + groceries.get(3));

        if (groceries.contains("musturd")) {
            System.out.println("Musturd is available");
        }

        groceries.add("Yogurt");
        System.out.println(groceries.indexOf("Yogurt"));
        System.out.println(groceries.lastIndexOf("Yogurt"));

        groceries.remove(1);
        System.out.println(groceries);
        groceries.remove("Yogurt");
        System.out.println(groceries);

        groceries.removeAll(List.of("apple", "eggs"));
        System.out.println(groceries);

        groceries.retainAll(List.of("apple", "milk", "musturd", "cheese"));
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries);
        System.out.println(groceries.isEmpty());

        groceries.addAll(List.of("apple", "banana", "mango", "milk", "eggs"));
        groceries.addAll(Arrays.asList("eggs", "pickles", "musturd", "ham"));
        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));
    }
}
