package basics;

public class JavaMethods {

    public static void main(String[] args) {

        boolean isGameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(isGameOver, score, levelCompleted, bonus);
        System.out.println("The highscore is " + highScore);
        
        isGameOver = true;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        System.out.println("The next highScore is " + 
            calculateScore(isGameOver, score, levelCompleted,bonus));
    }

    public static int calculateScore(boolean isGameOver, int score, int levelCompleted, int bonus) {
        
        int finalScore = score;
        if (isGameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }
}