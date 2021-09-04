public class Vehicles {
    private String Name;
    private String size;

    public Vehicles(String name, String size) {
       this.Name = name;
        this.size = size;
    }

    public void name(){
        System.out.println(" The name of the car is "+ this.Name );
    }
    public void size(){

        System.out.println("The size of the car is " + size);
    }

}
