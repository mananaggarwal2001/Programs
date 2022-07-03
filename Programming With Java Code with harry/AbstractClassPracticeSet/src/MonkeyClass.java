
public class MonkeyClass {
    void jump(){
        System.out.println("The monkey is able to jump");
    }
    void bite(){
        System.out.println("Monkey Bites !!!!!!!!!");
    }
}
interface basicAnimal{
    void eat();
    void sleep();
}

class human extends MonkeyClass implements basicAnimal{
    public void eat(){
        System.out.println("Human eat Flesh/ vegitables etc");
    }
    public void sleep(){
        System.out.println("Human Sleep 7-8 Hours a day");
    }
}
