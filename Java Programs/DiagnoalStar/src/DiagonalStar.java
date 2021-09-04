public class DiagonalStar {
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        }
        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= number; j++) {

                if (i == 1 || i == number) {
                    System.out.print("*");
                }else{
                    if(i>=2&&i<=number){
                        if(j==1)
                            System.out.print("*");
                        if(j==number){
                            System.out.print("*");
                        }
                    }
                }
                }
            System.out.println();
            }

        }
    }

