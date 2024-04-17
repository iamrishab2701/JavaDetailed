package basics;

public class AbbriviatingOperator {
    public static void main(String[] args) {

        int result = 10;

        //Increment by one
        result++; // 11 Post-Fix Increment Operator
        System.out.println(result);
        result += 1; // Compound Assignment Operator with + sign
        System.out.println(result);

        //Decrement by one
        result--; // 11 Post-Fix Decrement Operator
        System.out.println(result);
        result -= 1; // Compound Assignment Operator with - sign
        System.out.println(result);

        result -= 5.5;
        System.out.println(result); // 4

        //result = result - 5.5; // Throw the conversion error.
        //System.out.println(result);
        result = 10;
        result = (int) (result - 5.5);
        System.out.println(result);
    }
}