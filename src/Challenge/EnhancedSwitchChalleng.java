package Challenge;

public class EnhancedSwitchChalleng {

    // Day of the week challenge

    /*
     * 1. Create a method called printDayOfWeek, that takes an int parameter called
     * day, but doesn't return any values.
     *
     * Use the enhanced switch statement, to return the name of the day, based on
     * the parameter passed to the switch statement, so that 0 will return "Sunday",
     * 1 will return "Monday", and so on. Any number not between 0 and 6, should
     * return "Invalid Day".
     *
     * Use the enhanced switch statement as an expression, returning the result to a
     * string named dayOfTheWeek.
     *
     * Print both the day variable and the dayOfTheWeek variable
     *
     * In the main method, call this method for the value 0 through 7.
     *
     * Bonus: Create a second method called printWeekDay, that uses an if then else
     * statement, instead of a switch, to product the same output.
     */

    public static void main(String[] args) {
        System.out.println(printDayOfWeek(8));
        System.out.println(printWeekDay(2));
    }

    public static String printDayOfWeek(int day) {
        return switch (day) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> {
                yield "Invalid day";
            }
        };
    }

    public static String printWeekDay(int day) {
        if (day == 1) {
            return "Sunday";
        } else if (day == 2) {
            return "Monday";
        } else if (day == 3) {
            return "Tuesday";
        } else if (day == 4) {
            return "Wednesday";
        } else if (day == 5) {
            return "Thursday";
        } else if (day == 6) {
            return "Friday";
        } else if (day == 7) {
            return "Saturday";
        } else {
            return "Invalid day";
        }
    }

}