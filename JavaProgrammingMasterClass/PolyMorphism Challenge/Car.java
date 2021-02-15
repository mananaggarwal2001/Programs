import org.w3c.dom.ls.LSOutput;

public class Car {
    private boolean engine;
    private int Cylinders;
    private int no_of_Vehicles;
    private String Model_name;
    private String optionalFeatures;

    public Car(int no_of_Vehicles,String name,String optionalFeatures) {
        this.engine = true;
        Cylinders = 4;
        this.no_of_Vehicles = no_of_Vehicles;
        this.Model_name=name;
        this.optionalFeatures=optionalFeatures;
    }

    public int getNo_of_Vehicles() {
        return no_of_Vehicles;
    }

    public String getModel_name() {
        return Model_name;
    }
    public boolean startengine(){
        if(engine) {
            return true;
        }else{
            return false;
        }
    }
    public void acceralate(){
        if(startengine()){
            System.out.println("Acceralate is possible");
        }else{
            System.out.println("Acceralate is not possible");
        }
    }
    public String breaks(boolean breaks) {
        if (startengine()) {
            if (breaks) {
                return "Stopping of car is possible";
            } else {
                return "Stopping of car is not possible";
            }
        }
        return null;
    }
    public String getOptional_Features(){
        return this.optionalFeatures;
    }

}

class Audi extends Car{

    public Audi() {
        super(1, "R8","Gps Tracker , Automatic Gearing system");
    }

    @Override
    public boolean startengine() {
        return super.startengine();
    }

    @Override
    public void acceralate() {
        super.acceralate();
    }

    @Override
    public String breaks(boolean breaks) {
        return super.breaks(breaks);
    }
}
class WagonR extends Car{

    public WagonR() {
        super(2, "WagonR",
        "Good Mileage , FM radio with Aux mode available,Good comfort");
    }

    @Override
    public boolean startengine() {
        return super.startengine();
    }

    @Override
    public void acceralate() {
        super.acceralate();
    }

    @Override
    public String breaks(boolean breaks) {
        return super.breaks(breaks);
    }
}


class swift extends Car{
    private String optionalFeatures;

    public swift() {
        super(3, "Swift Dzire",
      "Great Spacing , Good Mileage");
    }
    public String getOptionalFeatures(){
        return this.optionalFeatures;
    }

    @Override
    public boolean startengine() {
        return super.startengine();
    }

    @Override
    public void acceralate() {
        super.acceralate();
    }

    @Override
    public String breaks(boolean breaks) {
        return super.breaks(breaks);
    }
}


