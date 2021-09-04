public class speedconerterexercise {
    public static void main(String[] args) {

        long kmperhour = (long) 80.4;
        long mileperhour=tomileperhour(kmperhour);
        System.out.println("the distance in mileper hour is " + mileperhour);

    }
    public static long tomileperhour(double kilometerherhour){

        if(kilometerherhour<0){
            return -1;
        }else{
           return Math.round(kilometerherhour/1.609344);


        }

    }

}
