package basics;

public class StatementWhiteSpaceIndentation {

    public static void main(String[] args) {

        int myVariable = 50;

        myVariable++;
        myVariable--;

        System.out.println("This is a test");

        System.out.println("This is" + // this is valid
                " another" +
                " still more");

        int anotherVariable = 50;
        myVariable--;
        System.out.println("myVariable = " + myVariable); // Not recommended

        if (myVariable == 0) {
            System.out.println("It's is now zero");
        }
    }
}