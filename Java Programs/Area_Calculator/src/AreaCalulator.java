public class AreaCalculator {
    public static double area(double radius){
        if(radius<0){
            return -1;
        }else {
            double area;
            return area = Math.PI * radius * radius;
        }

    }
    public static double area(double x,double y){
        double rec_area;
        return rec_area = x*y;
    }
}
