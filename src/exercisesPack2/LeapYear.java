package exercisesPack2;

public class LeapYear {

    public static boolean isLeapYear(int year) {
        if (year <= 0 || year > 9999) {
            return false;
        }
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }

}
