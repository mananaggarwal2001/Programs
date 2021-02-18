public class SpeedConverter {
    public static long toMilesPerHour(double KilometerPerHour) {
        if (KilometerPerHour < 0) {
            return -1;
        } else {
            return Math.round(KilometerPerHour / 1.6093);

        }

    }

    public static void PrintConversion(double KilometerPerHour) {
        if (KilometerPerHour < 0) {
            System.out.println("The Value is Invalid");
        } else {
            long MilesPerHour = toMilesPerHour(KilometerPerHour);
            System.out.println(KilometerPerHour + " Km/h = " + MilesPerHour + " Miles/h");
        }
    }
}
