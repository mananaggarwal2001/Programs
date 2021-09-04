import java.util.ArrayList;
import java.util.Scanner;

public class Album {
    private ArrayList<Song> songs=new ArrayList<Song>();
    private Scanner scanner=new Scanner(System.in);
    private String Albumname;

    public String getAlbumname() {
        return Albumname;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }


    public void inputsongs(){
        System.out.print("Enter the Album Name: ");
        Albumname=scanner.nextLine();
        boolean Surity=true;
        String songname;
        double duration;
        int count=1;

        while(Surity){
            System.out.print("Enter the duration of the song: ");
            duration=scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Enter the "+count+" Song Name: ");
            songname=scanner.nextLine();
            String songstore=songname;
            Song song=new Song(songstore,duration);
            songs.add(song);
            System.out.print("Are you sure want to continue: ");
            Surity=scanner.nextBoolean();
            count++;
        }
        scanner.nextLine();
    }
}
