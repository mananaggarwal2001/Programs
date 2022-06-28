public class Cylinder extends PracticeQuestionNo1 {
    public float height;
    Cylinder() {
        System.out.println("I am the default Contructor of the cylinder");
    }
    Cylinder(float height, float radius){
        super(radius);
        this.height= height;
    }

    @Override
    void Area() {
        double area= Math.PI * 2 * Math.PI * radius* height;
        System.out.println("The area of the Cylinder is :- "+ area);
    }
}
