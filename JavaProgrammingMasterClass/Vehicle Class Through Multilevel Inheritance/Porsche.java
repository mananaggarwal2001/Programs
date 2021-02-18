public class Porsche extends Car {
    private double Speed;
    private String Model_name;
    private String features;

    public Porsche( String model, int no_of_gears, double speed, String features) {
        super("Porsche","Same", model, no_of_gears, speed, 4);
        this.features = features;
    }

    public double getSpeed(){
        return Speed;
    }

    public String getModel_name() {
        return Model_name;
    }

    public String getFeatures() {
        return features;
    }


}
