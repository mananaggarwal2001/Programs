public class Car extends Vehicles {
    private String model;
    private int no_of_gears;
    private double speed;
    private int no_of_doors;

    public Car(String name, String size, String model, int no_of_gears, double speed, int no_of_doors) {
        super(name, size);
        this.model = model;
        this.no_of_gears = no_of_gears;
        this.speed = speed;
        this.no_of_doors = no_of_doors;
    }

}
