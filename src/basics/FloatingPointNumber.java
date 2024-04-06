package basics;

public class FloatingPointNumber {

    public static void main(String[] args) {
        
        // Min and Max value of float and double
        System.out.println("float value range("+Float.MIN_VALUE+" to "+Float.MAX_VALUE+")");
        System.out.println("double value range("+Double.MIN_VALUE+" to "+Double.MAX_VALUE+")");

        int myIntValue = 5; float myFloatValue = 5f; double myDoubleValue = 5d;
        System.out.println(myIntValue);
        System.out.println(myDoubleValue);
        System.out.println(myFloatValue);

        float myOtherFloatValue = 5.25f;
        System.out.println(myOtherFloatValue);

        //Challenge
        float myAnotherFloatValue = (float)5.25;
        System.out.println(myAnotherFloatValue);

        myIntValue = 5/2;
        System.out.println(myIntValue);

        myFloatValue = 5f/2f;
        System.out.println(myFloatValue);

        myDoubleValue = 5d/2d;
        System.out.println(myDoubleValue);

        myFloatValue = 5f/3f;
        System.out.println(myFloatValue);

        myDoubleValue = 5d/3d;
        System.out.println(myDoubleValue);


        myDoubleValue = 5.00 / 3; // It is allowed if one of the operand is double
        System.out.println(myDoubleValue);
    }
}
