public class Dog extends Animals {                  //child class
    private int eyes;
    private int tail;
    private int teeth;
    private String coat;


    public Dog(String name, int size, int weight,int eyes,int tail,int teeth,String coat) {
        super(name, 1, 1, size, weight);// super class is like a this constructor
                                                    // as we are making the constructor in a extend class be getting some basic information from the base class.
        this.eyes=eyes;
        this.tail=tail;
        this.teeth=teeth;
        this.coat=coat;
    }

    public void chew(){
        System.out.println("Dog.chew");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog.eat");
        chew();
    }
    public void move(){
        move(10);
    }
    public void run(){
        move(25);
    }

}
