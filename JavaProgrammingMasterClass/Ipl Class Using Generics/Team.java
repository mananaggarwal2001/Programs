import java.util.ArrayList;

public class Team<T extends Player> {
    private String name;
    private int win=0;
    private int lost=0;
    private int tied=0;
    private int Played;

    private ArrayList<T> members=new ArrayList<>();

    public boolean addMembers(T player){
        if(members.equals(player)){
            System.out.println(player.getLeaguePlayername() +" is already in the List ");
            return false;
        }else {
            members.add(player);
            System.out.println(player.getLeaguePlayername() + " is picked for the team "+player.getClass());
            return true;
        }
    }

    public int ranking(){
        return (win*2) + tied;
    }


    private String tostring() {
        return "Team{" +
                " win=" + win +
                ", lost=" + lost +
                ", tied=" + tied +
                ", Played=" + Played +
                '}';
    }

    public void result(Team oppositeteam, int ourscore, int oppositescore){
        if(ourscore>oppositescore){
            win++;
        }else if(ourscore<oppositescore){
            lost++;
        }else{
            tied++;
        }
        Played++;
        System.out.println(tostring());
    }

}
