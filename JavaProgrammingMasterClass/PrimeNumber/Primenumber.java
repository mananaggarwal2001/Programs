public class Primenumber {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println("PRIME NUMBER IS  " + i + " THIS ");

                count++;


            }
        }
        System.out.println("NUMBER OF PRIME NUMBER ARE  " + count);

    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {

                return false;
            }
        }


        return true;
    }
}
