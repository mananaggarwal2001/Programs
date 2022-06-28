import com.sun.security.jgss.GSSUtil;

class Base{
    int x;
    Base(){
        System.out.println("This is the first number in the class");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class inheritanceinJava {

    public static void main(String[] args) {

    }
}
