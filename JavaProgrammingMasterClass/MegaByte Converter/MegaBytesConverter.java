public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int KiloBytes) {
        if (KiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megabytes = KiloBytes / 1024;
            int remaining_Kilobytes = KiloBytes % 1024;
            System.out.println(KiloBytes + " KB = " + megabytes + " MB and " + remaining_Kilobytes + " KB");

        }

    }
}
