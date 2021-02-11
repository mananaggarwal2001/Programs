public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(12,12,5);
        Case thecase =new Case("220B","Corsair","Antec",dimensions);
        Motherboard motherboard= new Motherboard("Z370 Pro Gaming ","Asus",4,2,"v2.2");
        Monitor monitor= new Monitor("curve ","Samsung",14,new Resolution(1280,1080));
        PC pc=new PC(monitor,thecase,motherboard);
        pc.getMonitor().drawPixelAt(1440,1080,"Red");
        pc.getMotherboard().LoadProgram("Window 7");
        pc.getThecase().getDimensions();

    }
}
