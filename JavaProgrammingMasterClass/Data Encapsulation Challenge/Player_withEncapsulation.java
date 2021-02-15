public class Player_withEncapsulation {
    private String fullname;
    private int health=100;
    private String weapon;

    public Player_withEncapsulation(String fullname, int health, String weapon) {
        this.fullname = fullname;
        if(health>0 && health<=100) {
            this.health = health;
        }
        this.weapon = weapon;
    }

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
    public int getHealth(){
        return this.health;
    }
}
