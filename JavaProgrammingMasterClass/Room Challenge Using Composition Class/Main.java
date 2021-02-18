public class Main {
    public static void main(String[] args) {
        Resolution resolution= new Resolution(12,12,12);
        Bed bed=new Bed("Red",resolution);
        Resolution resolution1=new Resolution(13,14,12);
        Almirah almirah=new Almirah("brown",resolution1);
        System.out.println(" Almirah Colour is " + almirah.getColour());
        System.out.println(" Almirah Area is  " + almirah.getResolution().Area());
        System.out.println(" Bed Resolution is  "+ bed.getResolution().Area());
    }
}
