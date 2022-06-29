abstract class Parent2{
    public Parent2(){
        System.out.println("Mai base 2 ka constructor hoon");
    }

    public void sayHello(){
        System.out.println("Hello World");
    }

    abstract public void greet(); // aee baccho tum iss method of override karlo aur jaise chaho waise implement karlo. Baap Message.

}
class childClass2 extends  Parent2{
    childClass2(){
        System.out.println("I ma the constructor of the chilClass2");
    }

    @Override
    public void greet() {
        System.out.println("Good Morning Papa");
    }
}

class child3 extends Parent2{
    public  void hello(){
        System.out.println("Hello World");
    }
    public void greet(){
        System.out.println("Good Morning grandFather");
    }

}

// Making of the object of the abstract class is not possible.


public class AbstractClass {
    public static void main(String[] args) {
//            Parent2 p = new Parent2(); --> Throws the error in the abstract Class.
        childClass2 childClass2 = new childClass2(); // The object is possible because the class is the concrete class.
        child3 child3 = new child3(); // Object is  possible because the class is the concrete class.
    }
}
