import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears;
    private int MaxGears;
    private int currentgear = 0;
    private boolean clutchisin;

    public GearBox(int maxGears) {
        MaxGears = maxGears;
        this.gears=new ArrayList<Gear>();
        Gear Neutral= new Gear(0,0.0);
        this.gears.add(Neutral);
    }
    public void operateClutch(boolean in){
        this.clutchisin=in;
    }
    public void addgear(int number, double ratio){
        if((number>0) && (number<=MaxGears)){
            this.gears.add(new Gear(number,ratio));
        }
    }
    public void ChangeGear(int newgear){
        if((newgear>0) && (newgear<=this.gears.size()) && clutchisin){
            this.currentgear=newgear;
        }else{
            System.out.println("Grind ");
            this.currentgear=0;
        }
    }
    public double Wheelspeed(int revers){
        if(clutchisin){
            System.out.println("Scream!!!!!");
            return 0.0;
        }else{
            return revers* gears.get(currentgear).getRatio();
        }
    }

    private  class Gear{
        private int GearNumber;
        private double Ratio;

        public Gear(int gearNumber, double ratio) {
            GearNumber = gearNumber;
            Ratio = ratio;
        }
        public double drivespeed(int revs){
            return revs* this.Ratio;
        }

        public double getRatio() {
            return Ratio;
        }


    }
}
