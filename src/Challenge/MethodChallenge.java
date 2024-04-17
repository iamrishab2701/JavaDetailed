package Challenge;

public class MethodChallenge {

    /*
     * In this challenge we're going to create two methods
     * The first method should be named displayHighScorePosition
     *
     * This method should have two parameters, one for a player's name, and one for
     * player position in a high score list
     *
     * This method should print a message like "Tim managed to get into position 2
     * on the high score list".
     *
     * This second method should be name calculateHighScorePosition.
     * This method should have only one parameter, the player's score.
     * This method should return a number between 1 and 4, based on below score
     * values
     *
     * Score greater than or equal to 1000 - 1
     * Score greater than or equal to 500 but less than 1000 - 2
     * Score greater than or equal to 100 but less than 500 - 3
     * All other scores - 4
     * Finally, we'll call both methods and display the result for the following
     * scores
     * 1500, 1000, 500, 100, and 25
     */

    public static void main(String[] args) {
        String playerName = "Time";

        int playerPosition1 = calculateHighScorePosition(1500);
        displayHighScorePosition(playerName, playerPosition1);

        int playerPosition2 = calculateHighScorePosition(1000);
        displayHighScorePosition(playerName, playerPosition2);

        int playerPosition3 = calculateHighScorePosition(500);
        displayHighScorePosition(playerName, playerPosition3);

        int playerPosition4 = calculateHighScorePosition(100);
        displayHighScorePosition(playerName, playerPosition4);

        int playerPosition5 = calculateHighScorePosition(25);
        displayHighScorePosition(playerName, playerPosition5);

    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(
                "" + playerName + " manage to get into position " + playerPosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {

        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if ((playerScore >= 500)) {
            position = 2;
        } else if ((playerScore >= 100)) {
            position = 3;
        }

        return position;
    }
}