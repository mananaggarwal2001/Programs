public class Fish extends Animals {
    private int gills;
    private int eyes;
    private int fins;
    private int mouth;

    public Fish(String name, int brain, int body, int size, int weight, int gills, int eyes, int fins, int mouth) {
        super(name, brain, body, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
        this.mouth = mouth;
    }

    public  void swim(){
        System.out.println("Fish swim called()");
        super.move(70);
    }
    public  void Backfins(){
        System.out.println("Fish move with the help of Back fins");
    }
    public void Movemuscles(){
        System.out.println("Fish move with the help of muscles");
    }

    @Override
    public void move(int speed) {
        super.move(speed);
        System.out.println(" fish moves ");

    }


}
