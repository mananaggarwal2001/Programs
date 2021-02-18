public class SecondAndMinuteChallenge {
    public static String getGetDurationString (int minutes,int seconds){
        if(minutes<0||seconds>60||seconds<0){
            return "Invalid Value";
        }else{
            int hour,remainingminutes;
            hour=minutes/60;
            remainingminutes=minutes%60;
            return (hour + " hrs " + remainingminutes +" minutes "+ seconds + " seconds ");


        }

    }
    public static String getGetDurationString (int seconds){
        if(seconds<0){
            return "Invalid value";
        }else{
            int minutes;
            minutes=seconds/60;
            int remaingseconds=seconds%60;

            return (getGetDurationString(minutes,remaingseconds));


        }
    }
}
