package basics;

public class WrapperClass {
    
    public static void main(String[] args) {
        
        //Integer wrapper Class
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        int bustedMaxIntValue = Integer.MAX_VALUE + 1;
        System.out.println(bustedMaxIntValue); // Overflow

        int bustedMinIntValue = Integer.MIN_VALUE - 1;
        System.out.println(bustedMinIntValue); // Underflow

        int myMaxIntValue = 2_147_483_647;
        System.out.println(myMaxIntValue);
    }
}