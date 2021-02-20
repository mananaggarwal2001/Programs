public abstract class Player {
    private String leaguePlayername;

    public Player(String playername) {
        leaguePlayername = playername;
    }

    public  String getLeaguePlayername() {
        return leaguePlayername;
    }
}
