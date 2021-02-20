public class Main {
    public static void main(String[] args) {
        Sunrisers_Hydrabad Manan=new Sunrisers_Hydrabad("Manan");
        Team<Sunrisers_Hydrabad> achino=new Team<>();
        achino.addMembers(Manan);
        Rajasthan_royal Aman=new Rajasthan_royal("Aman");
        Team<Rajasthan_royal> royal=new Team<>();
        royal.addMembers(Aman);
        royal.result(achino,3,1);
        royal.result(achino,2,1);
        royal.result(achino,1,3);


    }
}
