public class Car {
    private String colour;      // State Variables of the class Called Car.
    private int wheels;
    private String doors;
    private String engine;
    private String model; // Car class Fields.

    public void setModel(String model) {                                              //String model is a method parameter
        String validmodel=model.toLowerCase();
        if(validmodel.contentEquals("porsche")|| validmodel.contentEquals("honda city")) {
            this.model = model;
        }else{
            this.model="unknown";
        }


    }

    public String getModel() {
        return this.model;

    }
}
