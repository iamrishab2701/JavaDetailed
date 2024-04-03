public class WholeNumberDataType {

    public static void main(String[] args) {
        
        //Integer Minimum and Maximum Value
        System.out.println("Integer Value Range ("+Integer.MIN_VALUE+" to "+Integer.MAX_VALUE+")");

        //Byte Minimum and Maximum Value
        System.out.println("Byte Value Range ("+Byte.MIN_VALUE+" to "+Byte.MAX_VALUE+")");

        //Short Minimum and Maximum Value
        System.out.println("Short Value Range ("+Short.MIN_VALUE+" to "+Short.MAX_VALUE+")");

        //Long Minimum and Maximum Value
        System.out.println("Byte Value Range ("+Long.MIN_VALUE+" to "+Long.MAX_VALUE+")");

        //Long variable
        long myLongValue = 100L;
        short myShortValue = 32767;

        // Long size and Width
        System.out.println("A long has a width of " + Long.SIZE);

        // short size and Width
        System.out.println("A short has a width of " + Short.SIZE);

        // byte size and Width
        System.out.println("A Byte has a width of " + Byte.SIZE);

        // int size and Width
        System.out.println("A int has a width of " + Integer.SIZE);
    }
    
}
