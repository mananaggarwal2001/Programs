interface sampleInterface{
    void math1();
    void math2();
}
interface childInterface extends sampleInterface{ // inheriting the interface from the another interface.
    void math3();
    void math4();
}
class mychildSampleClass implements childInterface{
    @Override
    public void math3() {
        System.out.println("This is the meth 3 class");
    }

    @Override
    public void math4() {
        System.out.println("This the meth4 interface class");
    }

    @Override
    public void math1() { // This method is coming from the inheritance of the interface.
        System.out.println("This is the meth 1 interface class");
    }

    @Override
    public void math2() { // This method is also coming from the inheritance of the interfaces.
        System.out.println("This the meth2 Class");
    }
}



public class Mainfunctioin {
    public static void main(String[] args) {

    }
}
