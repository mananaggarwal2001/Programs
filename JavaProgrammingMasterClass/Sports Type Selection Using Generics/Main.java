public class Main {
    public static void main(String[] args) {
        Baseball joe=new Baseball("joe");
        Basketball Manan=new Basketball("manan");
        Football pat=new Football("pat");
        Team<Football> adlem=new Team<>("adlem"); // Generic Class Object Formation
        adlem.addPlayer(pat);
        System.out.println(adlem.numplayer());
    }
}
