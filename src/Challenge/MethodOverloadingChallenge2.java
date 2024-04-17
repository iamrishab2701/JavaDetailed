package Challenge;

public class MethodOverloadingChallenge2 {

    /*
     * In this challenge, we're going to create a method, that takes time,
     * represented in seconds, as the paramters.
     *
     * We'll then want to transform the seconds into hours.
     *
     * Next we'll display the time in hours, with the remaining minutes and seconds,
     * in a String.
     *
     * We'll do this transformation in two steps, which allows us to use overloaded
     * methods.
     *
     * We want to create two methods with the same name: getDurationString
     *
     * The first method has one parameter of type int, named seconds
     *
     * The second method has two parameters, named minutes and seconds, both ints.
     *
     * Both methods return a String in the format shown: XXh YYm ZZs
     *
     * where XX represents the number of hours, YY the number of minutes, and ZZ the
     * number of seconds.
     *
     * The first method should in turn call the second method to return its results.
     *
     * Make both methods public and static as we'hv been doing so far in this
     * course.
     *
     * Remember that one minute is 60 seconds, and one hour equals 60 minutes, or
     * 3600 seconds.
     *
     * Add validation to the methods as a bonus
     *
     * For the first method, the seconds parameter should >=0
     *
     * For the second method, the minutes parameter should be >=0, and the seconds
     * parameter should >=0, and <=59.
     *
     * if either method is passed an invalid valid, print out some type of
     * meaningful message to the user.
     */
    public static void main(String[] args) {
        System.out.println(getDurationString(4500));
        System.out.println(getDurationString(58, 20));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Please enter correct seconds Value";
        } else {
            int minutes = seconds / 60;
            int toHour = minutes / 3600;
            int toMinutes = minutes % 60;
            int toSeconds = seconds % 60;
            return toHour + "h " + toMinutes + "m " + toSeconds + "s";
        }
    }

    public static String getDurationString(int minutes, int seconds) {
        if (seconds < 0) {
            return "Please correct the seconds value it should not be less than or equal to zero";
        } else if (minutes < 0 || minutes > 59) {
            return "Please check the minutes value it should be greater than 0 and less than 59";
        } else {
            return getDurationString((minutes * 60) + seconds);
        }
    }
}