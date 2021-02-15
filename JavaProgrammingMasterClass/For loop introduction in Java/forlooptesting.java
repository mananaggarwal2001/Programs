public class forlooptesting {
    public static void main(String[] args) {
        for(int i=8;i>=2;i--){
            System.out.println(" 10000 at "+i+" interest is "+ calculate_interest(10000,i));
        }

    }
    public static double calculate_interest(double amount,double interest){
        return(amount*(interest/100));
    }
}
