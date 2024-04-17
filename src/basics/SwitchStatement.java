package basics;

public class SwitchStatement {
    public static void main(String[] args) {

        // Switch Statement

        int switchValue = 4;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
                System.out.println("Value was 3");
            case 4:
            case 5:
            case 6: // Adding multiple cases in a single line.
                System.out.println("Was a 3, a 4, or a 5");
                System.out.println("Actually it was " + switchValue);
                break;
            default:
                System.out.println("Was not 1,2 or 3, 4, or 5");
                break;
        }

        String month = "xz";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }

    public static String getQuarter(String month) {

        //Classic Switch
        // switch (month) {
        //     case "JANUARY":
        //     case "FEBRUARY":
        //     case "MARCH":
        //         return "1st";
        //     case "APRIL":
        //     case "MAY":
        //     case "JUNE":
        //         return "2nd";
        //     case "JULY":
        //     case "AUGUST":
        //     case "SEPTEMBER":
        //         return "3rd";
        //     case "OCTOBER":
        //     case "NOVEMBER":
        //     case "DECEMBER":
        //         return "4th";
        // }

        // return "bad";

        //Enhanced Switch

        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> {
                yield "1st";
            }
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse; //yield is a new keyword to use it in switch keyword to return a value.
            }
        };
    }
}