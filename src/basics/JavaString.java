package basics;

public class JavaString {

    public static void main(String[] args) {
        
        // Declaration
        String myString = "This is a String";
        System.out.println("myString is equal to " + myString);

        myString = myString + " and more String";
        System.out.println("myString is equal to" + myString);

        //Printing String with unicode
        System.out.println("I wish I had \u002432334234323432");

        String lastString = "10"; int myInt = 50;
        lastString = lastString + myInt; // Concatenation
        System.out.println(lastString);

        double doubleNumber = 10.230;
        lastString = lastString + doubleNumber;
        System.out.println(lastString);

    }
    
}
