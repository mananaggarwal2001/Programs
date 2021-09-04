public class Functionmethodchallenge {
    public static void main(String[] args){
        String playername="manan";
        int playerscore= 1500;
        int position = calculatehighscoreposition(playerscore);
        displayhighscoreposition(playername,position);

        playername="aman";
        playerscore= 900;
        position=calculatehighscoreposition(playerscore);
        displayhighscoreposition(playername,position);

        playername="sarthak";
        playerscore=400;
        position=calculatehighscoreposition(playerscore);
        displayhighscoreposition(playername,position);

        playername="jaiswal";
        playerscore=50;
        position=calculatehighscoreposition(playerscore);
        displayhighscoreposition(playername,position);


    }
    public static void displayhighscoreposition(String playername,int position ){
        System.out.print("Player Name = "+ playername + "\t managed to get the positon\t"
                + position + "\ton the high score table\n");


    }
    public static int calculatehighscoreposition(int playerscore){
        if(playerscore>=1000){
            return 1;
        }else if(playerscore>=500 && playerscore<1000){
            return 2;
        }else if(playerscore>=100 && playerscore<500){
            return 3;
        }else{
            return 4;
        }
    }
}
