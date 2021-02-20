import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {  //<T> is used to make a class a paricular type class to make it more specific.
    // <T> is used in java to make it a generic class.
    private String name;
     int played=0;
     int won=0;
     int lost=0;
     int tied=0;
     private ArrayList<T> members=new ArrayList<>(); //Generic list
     public Team(String name){
         this.name=name;
     }

    public String getName() {
        return name;
    }
    public boolean addPlayer(T player){
         if(members.contains(player)){
             System.out.println(((Player) player).getPlayername()+" is already in the team " + this.name);
             return false;
         }else{
             members.add(player);
             System.out.println(((Player)player).getPlayername() + " is picked for the team in the sports ");
             return true;
         }
    }
    public int numplayer(){
         return members.size();
    }


    private String string() {
        return "Team{" +
                "played=" + played +
                ", won=" + won +
                ", lost=" + lost +
                ", tied=" + tied +
                '}';
    }

    public void matchresult(Team opponent, int ourscore, int theirscore){
         if(ourscore>theirscore){
             won++;
         }else if(ourscore<theirscore){
             lost++;
         }else{
             tied++;
         }
         played++;
        System.out.println(string());

         if(opponent!=null){
             opponent.matchresult(null,ourscore,theirscore);
         }
    }
    public int ranking(){
         return (won*2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
         if(this.ranking()>team.ranking()){
             return -1;
         }else if(this.ranking()<team.ranking()){
             return 1;
         }else{
             return 0;
         }
    }
}
