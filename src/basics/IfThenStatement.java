package basics;

public class IfThenStatement {

    public static void main(String[] args) {

        boolean isAlien = false;

        if (isAlien == false) {
            System.out.println("It is not an alien");
        }

        int topScore = 90;
        if (topScore <= 100) {
            System.out.println("You got the high score!");
        }

        // Use of logical AND (&&) operator
        int secondTopScore = 80;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        // Use of Logical OR (||) operator
        if ((topScore > 90) || (secondTopScore >= 80)) {
            System.out.println("Either or both the conditions are true");
        }


        //Challenge
        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an true");
        }


        boolean isCar = false;
        if (isCar == true) // equal works in this case because boolean type is required when provinding the condition but still wrong. Equality operator needs to be added.
        {
            System.out.println("This is not supposed to happen");
        }

        if (!isCar) // Indicates not true
        {
            System.out.println("It is not true");
        }
    }
}