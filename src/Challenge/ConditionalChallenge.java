package Challenge;

public class ConditionalChallenge {

    public static void main(String[] args) {

        //Step 1: create a double variable with a value of 20.00;

        double myFirstDouble = 20.00d;

        //Step 2: create a second variable of type double with value 80.00

        double mySecondDouble = 80.00d;

        // Step 3: Add both numbers together, then multiply by 100.00

        double result = (myFirstDouble + mySecondDouble) * 100.00d;
        System.out.println(result);

        // Step 4: Use the remainder operator, to figure out what the remainder from the result of the operation in step three, and 40.00 will be

        double remainder = result % 40.00d;
        System.out.println(remainder);

        // Step 5: create a boolean variable that assigns the value true, if the remainder in step four is 0.00, or false if it's not zero

        boolean remainderIsZero = (remainder == 0.00d) ? true : false;

        // Step 6: Output the boolean variable just to see what the result is.

        System.out.println(remainderIsZero);

        // Step 7: write an if-then statement that displays a message, 'got some remainder', if the boolean in step five is not true

        if (!remainderIsZero) {
            System.out.println("Got some remainder");
        }
    }

}
