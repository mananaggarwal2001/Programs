abstract public class Pen {
    abstract void refill();
    abstract void write();
}

class fountainPen extends Pen{
    void changeNib(){
        System.out.println("Changing the nib for  the pen");
    }
    public void refill(){
        System.out.println("Refilling the Pen !!!!!!!!!!");
    }
    public void write(){
        System.out.println("Writing with the fountain pen");
    }
}
