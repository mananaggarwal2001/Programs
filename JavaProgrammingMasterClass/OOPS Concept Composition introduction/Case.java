public class Case {
    private String models;
    private String manufacturer;
    private String powersupply;
    private Dimensions dimensions;

    public Case(String models, String manufacturer, String powersupply, Dimensions dimensions) {
        this.models = models;
        this.manufacturer = manufacturer;
        this.powersupply = powersupply;
        this.dimensions = dimensions;
    }

    public void PressPowerButton(){
        System.out.println("Power Button Pressed");
    }

    public String getModels() {
        return models;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowersupply() {
        return powersupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }


}
