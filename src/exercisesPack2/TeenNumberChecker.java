package exercisesPack2;

public class TeenNumberChecker {
    public TeenNumberChecker() {
    }

    public static boolean hasTeen(int a, int b, int c) {
        return ((isTeen(a)) || (isTeen(b)) || (isTeen(c)));
    }

    public static boolean isTeen(int x) {
        return (x >= 13 && x <= 19);
    }


    //Smallest solution to first half of challenge
//    public static boolean hasTeen(int a, int b, int c) {
//        return ((a <= 19 && a >= 13) || (b <= 19 && b >= 13) || (c <= 19 && c >= 13));
//    }

}
