public class rectangle {
    float length;
    float breadth;

    rectangle(){
        System.out.println("This is the default Constructor for the rectange");
    }
    rectangle(float length, float breadth){
        this.length= length;
        this.breadth= breadth;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getBreadth() {
        return breadth;
    }

    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }
    void Area(){
        System.out.println("The Area of the rectangle is :- " + length*breadth);
    }
}
