public class LargestPrime {
    public static int getLargestPrime(int number) {
        int primefactor=0;
        int count=0;



        if (number < 0||number==1||number==0) {
            return -1;
        } else {
            for(int i=2;i<=number;i++){
                if(number%i==0){
                    for(int j=2;j<=i;j++){
                        if(i%j==0) {
                            count++;
                        }

                    }
                }
                if(count==1){
                    if(primefactor<i){
                        primefactor=i;
                    }
                }
                count=0;
            }

        }
        return primefactor;
    }
}


