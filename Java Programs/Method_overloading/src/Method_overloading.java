public class Method_overloading {
    public static double calcFeetAndInchestocentimeters(double feets, double inches) {
        if(feets>=0&&(inches>=0&&inches<=12)){
            double centimeters;
            centimeters=12*feets*2.54;
            centimeters+=(inches*2.54);
            return centimeters;


        }else{
            return -1;
        }
    }

    public static double calcFeetAndInchestocentimeters(double inches) {
        if (inches >= 0 && inches <= 12) {
            double cm2;
            return cm2 = inches * 2.54;
        } else {
            return -1;


        }
    }
}

