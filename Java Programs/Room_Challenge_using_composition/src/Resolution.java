public class Resolution {
    private  double width;
    private  double height;
    private  double length;

    public Resolution(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }
    public double Area(){
        return (width*height*length);
    }

}
