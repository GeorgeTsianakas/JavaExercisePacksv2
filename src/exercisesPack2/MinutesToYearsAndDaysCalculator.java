package exercisesPack2;

public class MinutesToYearsAndDaysCalculator {

    private static long minutesInAYear = 365 * 24 * 60;
    private static long minutesInADay = 60 * 24;

    public MinutesToYearsAndDaysCalculator() {
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        System.out.println(
                minutes + " min = " +
                        minutes / minutesInAYear + " y and " +
                        (minutes % minutesInAYear) / minutesInADay + " d"
        );
    }

}
