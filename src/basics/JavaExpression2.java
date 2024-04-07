package basics;

public class JavaExpression2 {

    public static void main(String[] args) {
        
        double kilometers = (100* 1.609344);

        int highScore = 50;
        if(highScore > 25)
        {
            highScore = 100 + highScore; // add bonus points
        }

        int health = 100; // health = 100 is expression
        if((health < 25) && (highScore > 1000)){ // (health < 25) && (highScore > 1000) is expression
            highScore = highScore - 1000; // highScore = highScore - 1000 is expression
        }
    }
}