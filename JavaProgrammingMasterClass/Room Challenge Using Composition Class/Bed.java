public class Bed {
    private String Colour;
    private Resolution resolution;

    public Bed(String colour, Resolution resolution) {
        Colour = colour;
        this.resolution = resolution;
    }

    public String getColour() {
        return Colour;
    }

    public Resolution getResolution() {
        return resolution;
    }

}
