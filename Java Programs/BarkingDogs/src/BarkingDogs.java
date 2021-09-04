public class BarkingDogs {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(hourOfDay>0&&hourOfDay<=23){
            if(hourOfDay<8||hourOfDay>22){
                if(hourOfDay%2==0){
                    barking=false;
                    return barking;
                }else{
                    barking=true;
                    return barking;

                }
            }else{
                barking=false;
                return barking;
            }

        }else{
            barking=false;
            return barking;
        }
    }
}

