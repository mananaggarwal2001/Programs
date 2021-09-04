public class Player_Encapsulation_OOP {
    public String name;
    public int health;
    public String weapon;

    public void losehealth(){
        if(health<=0){
            System.out.println("Player knocked Out");
        }
    }
    public int healthremaing(int damage){
        health=health-damage;
        losehealth();
        return this.health;
    }
}
