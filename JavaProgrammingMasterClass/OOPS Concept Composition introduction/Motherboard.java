public class Motherboard {
    private String Model;
    private String manufacturer;
    private int ramslots;
    private int carslots;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramslots, int carslots, String bios) {
        Model = model;
        this.manufacturer = manufacturer;
        this.ramslots = ramslots;
        this.carslots = carslots;
        this.bios = bios;
    }
    public void LoadProgram(String Program){
        System.out.println("The Program Name is " + Program);
    }

    public String getModel() {
        return Model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamslots() {
        return ramslots;
    }

    public int getCarslots() {
        return carslots;
    }

    public String getBios() {
        return bios;
    }

}
