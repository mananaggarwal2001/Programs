interface  Bicycle{ // Interface is made of the Bycycle which is implemented in the all the others modified programs.
    void applyBreaks(int decrement);
    void SpeedUp(int increament);
    int a = 45;
}

interface BlowHorn{
    void BlowHornk3g();
    void BlowHornMainHoonNa();
}

class AvonCycle implements Bicycle, BlowHorn{
    void BlowHorn(){
        System.out.println("PEE POO PAAA..........");
    }

    @Override
    public void applyBreaks(int decrement) {
        System.out.println("Decreasing the speed of the cycle" + decrement);
    }

    @Override
    public void SpeedUp(int increament) {
        System.out.println("Increasing  the speed of the cycle by the " + increament);
    }

    @Override
    public void BlowHornk3g() {
        System.out.println("Kabhi Kushi Kabhi Gum");
    }

    @Override
    public void BlowHornMainHoonNa() {
        System.out.println("Mai hoon na Poo Pee Poo");
    }
} // All methods compulsory to implement in the class Bicycle otherwise it will throw the error.
public class MainClass {
    public static void main(String[] args) {
        // Properties that are made in the interface are final as they cannot be modified.
        AvonCycle a = new AvonCycle();
        a.applyBreaks(120);
        a.SpeedUp(300);
        System.out.println(a.a); // This Property can't be modified as they are final by default in the interface.
    }
}
