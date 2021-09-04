public class Almirah {
    private String Colour;
    private Resolution resolution;

    public Almirah(String colour, Resolution resolution) {
        Colour = colour;
        this.resolution = resolution;
    }

    public String getColour() {
        return Colour;
    }

    public Resolution getResolution() {
        return resolution;
    }
    public void chooseColour(){
        System.out.println("The colour choosen was" + Colour);
    }

}
