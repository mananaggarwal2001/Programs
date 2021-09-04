public class Name {
    private double number;
    private String Name;

    public Name(){
        this(12,"default name");
    }

    public Name(double number,String name){
        this.number=number;
        this.Name=name;
    }

    public void setNumber(double number){
        this.number=number;
    }

    public void setName(String Name){
        this.Name=Name;
    }

    public double getNumber() {
        return number;
    }

    public String getName() {
        return Name;
    }

    public void output(){
        System.out.println("Name is "+ Name+ " and number is " + number);
    }

}
