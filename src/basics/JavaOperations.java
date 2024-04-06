package basics;

public class JavaOperations {
    public static void main(String[] args) {
        
        int result = 1 + 2; // + and = is operator, 1 and 2 is operands 
        System.out.println(result);

        int previousResult = result;
        result = result - 1;  // 3 - 1
        System.out.println(result);

        char firstChar = 'A'; char secondChar = 'B';
        System.out.println(firstChar + secondChar); // Unicode value will be printing
        System.out.println("" + firstChar + secondChar); // It will print AB

        result = 2;
        result = result * 10; // 2 * 10 = 20
        System.out.println(result);

        result = result / 4; // 20 / 4 = 5
        System.out.println(result);

        //Remainder Operator
        result = 5;
        result = result % 3; // the remainder of (5%3) = 2
        System.out.println(result);
    }
}