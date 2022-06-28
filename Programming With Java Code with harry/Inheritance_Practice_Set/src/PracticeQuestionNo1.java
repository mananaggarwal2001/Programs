public class PracticeQuestionNo1 {
    public float radius;

    PracticeQuestionNo1(){
        System.out.println("I am  the default constructor");
    }
    PracticeQuestionNo1(float radius){
        this.radius= radius;
    }

    void Area(){
        System.out.println("The Area of the Circle is :- " + Math.PI * Math.pow(radius,2));
    }
}

