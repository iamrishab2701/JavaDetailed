package Challenge;

public class MainChallenge {

    public static void main(String[] args) {

        // Set the existing score variable to 10000
        // Set the existing levelCompleted variable to 8
        // Set the existing bonus variable to 200
        // Use the same if condition(meaning if gameOver is true) you want to perform
        // the same calculation, and print out the value of the finalScore variable

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }


        if (gameOver) {
            score = 10000;
            levelCompleted = 8;
            bonus = 200;
            finalScore = score;
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score on " + levelCompleted + " was " + finalScore);
        }

    }
}