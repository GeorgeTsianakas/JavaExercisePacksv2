package exercisesPack2;

public class PlayingCat {


    public PlayingCat() {
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        return (summer ? (temperature >= 25 && temperature <= 45) :
                (temperature >= 25 && temperature <= 35));
    }

//    public static boolean isCatPlaying(boolean summer, int temperature) {
//        if (summer && (temperature >= 25 && temperature <= 45) ||
//                !summer && (temperature >= 25 && temperature <= 35)) {
//            return true;
//        }
//        return false;
//    }

}
