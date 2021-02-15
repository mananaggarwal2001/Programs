class Movie {
    private String name;

    public Movie(String name) {
        this.name=name;
    }
    public String plot(){
        return "no plot here";
    }
    public String getName(){
        return name;
    }
}
class Jaws extends Movie{
    public Jaws(){
        super("jaws");
    }

    public String plot(){
        return "A shark eats lots of people";
    }

}
class Street_Dancer_3D extends Movie{
    public Street_Dancer_3D(){
        super("Street Dancer 3D");
    }

    public String plot(){
        return "Passion is everything";
    }
}
class Shivaji_the_boss extends Movie{
    public Shivaji_the_boss(){
        super("Shivaji the Boss");
    }
    public String plot(){
        return "Karma is everything";
    }
}
class Abcd2 extends Movie{
    public Abcd2(){
        super("Abcd 2");
    }
    public String plot(){
        return "No plot available";
    }
}
class Forgetable extends Movie{
    public Forgetable(){
        super("Forgetable");
    }
    // no plot available
}


