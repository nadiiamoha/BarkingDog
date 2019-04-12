public class BarkingDog {
    //                                         false             5
    public static boolean shouldWakeUp(boolean dogBarking, int hourOfDay) {

        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        if (dogBarking && (hourOfDay < 8 || hourOfDay > 22)) {

            return true;
        }
        return false;
    }
}