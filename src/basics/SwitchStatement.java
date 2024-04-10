package basics;

public class SwitchStatement {
    public static void main(String[] args) {
        
        
        //Switch Statement

        int switchValue = 4;

        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
                System.out.println("Value was 3");
            case 4: case 5: case 6: // Adding multiple cases in a single line.
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was " + switchValue);
                break;
            default:
                System.out.println("Was not 1,2 or 3, 4, or 5");
                break;
        }
    }
}