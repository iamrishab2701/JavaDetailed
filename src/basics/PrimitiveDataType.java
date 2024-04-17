package basics;

public class PrimitiveDataType {
    public static void main(String[] args) {

        int myValue = 1000; //Integer Data Type

        int myMinIntValue = Integer.MIN_VALUE; //Returns minimum values allowed for Integer data type.
        System.out.println("Minimine Integer Value is: " + myMinIntValue);

        int myMaxIntValue = Integer.MAX_VALUE; // Return maximum values allowed for Integer data type.
        System.out.println("Maximum Integer Value is: " + myMaxIntValue);

        System.out.println("Integer Value Range (" + myMinIntValue + " to " + myMaxIntValue + ")");
    }
}