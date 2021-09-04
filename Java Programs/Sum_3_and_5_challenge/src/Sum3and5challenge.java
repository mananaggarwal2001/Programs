public class Sum3and5challenge {
    public static void main(String[] args) {
        int sum=0;
        int count=0;
        for(int i=1;i<=1000;i++){
            if(i%3==0&&i%5==0){
                System.out.println("Number that is divisible by 3 and 5 is "+ i);
                sum+=i;
                count++;
            }
        }
        System.out.println("Sum of these numbers are "+ sum);
        System.out.println("Total Numbers are "+ count);

    }
}
