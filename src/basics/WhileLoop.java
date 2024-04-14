package basics;

public class WhileLoop {

    public static void main(String[] args) {

        // For Loop
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // While Loop
        int j = 1;
        boolean isReady = false;
        while (isReady) {
            if (j > 5) {
                break;
            }
            System.out.println(j);
            j++;
        }

        int k = 1;

        // do while loop
        do {
            if (k > 5) {
                break;
            }
            System.out.println(k);
            k++;
            isReady = (k > 0);
        } while (isReady);

        // Continue Statement

        int number = 0;
        while (number < 50) {
            number += 5;
            if(number % 25 == 0){
                continue;
            }
            System.out.print(number + "_");
        }
    }
}