public class Main {
    public static void main(String[] args) {
    for(int i=1;i<=11;i++){
    Movie movie=randommovie();
        System.out.println(" Movie # " +i +"\n" +
                           " Movie name was " + movie.getName() + "\n" +
                            " plot was " + movie.plot() + "\n");
    }
    }

    public static Movie randommovie(){
        int randomnumber=(int) (Math.random() *5) +1;
        System.out.println("Random Number Generated is :" + randomnumber);
        switch(randomnumber){
            case 1:
                return new Abcd2();
            case 2:
                return new Jaws();
            case 3:
                return new Shivaji_the_boss();
            case 4:
                return new Street_Dancer_3D();
            case 5:
                return new Forgetable();

            default:
                System.out.println("Wrong Choice");
                break;
        }
        return null;
    }
}
