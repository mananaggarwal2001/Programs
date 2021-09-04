public class PlayingCat {
    public static boolean isCatPlaying(boolean summer,int temprature){
        if(temprature>=25&&temprature<=35){
            summer=true;
            return summer;
        }else if(temprature>=25&&temprature<=45){
            summer=false;
            return summer;
        }else{
            summer=false;
            return summer;
        }
    }
}
