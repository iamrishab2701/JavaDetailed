public class Casting {

    public static void main(String[] args) {
        
        // Declaring multiple variable in single line
        short myMinShortValue = Short.MIN_VALUE; int myMinIntValue = Integer.MIN_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE; byte myMaxByteValue = Byte.MAX_VALUE;

        // Declaring multiple variable of same type in single line
        byte myFirstByte = 10, mySecondByte = 15;

        int myTotal = (myMinIntValue/2);
        System.out.println(myTotal);

        byte myNewByteValue = (byte)(myMinByteValue/2);
        System.out.println(myNewByteValue);

        short myNewShortValue = (short)(myMinShortValue/2);
        System.out.println(myNewShortValue);

        //Challenge
        byte latestByteVariable = 3;
        short latestShortVariable = 30;
        int latestIntVariable = 300;
        long latestLongVariable = 50_000 + 10*(latestByteVariable + latestShortVariable + latestIntVariable);
        System.out.println(latestLongVariable);
    }
}