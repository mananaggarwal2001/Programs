public class MinutesToYearsAndDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("invalid Value");
        }else{
            long days,years,remaingminutes;

            years=(minutes)/(60*24*365);
            remaingminutes=minutes-(years*365*24*60);
            days= remaingminutes/(60*24);

            System.out.println(minutes + " min = " + years + " y "+" And "+ days + " d " );



        }
    }
}
