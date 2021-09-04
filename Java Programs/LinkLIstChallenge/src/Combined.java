import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Combined {
    private ArrayList<Album> albums=new ArrayList<Album>();
    private  LinkedList<Song> playlist=new LinkedList<Song>();
    private Scanner scanner=new Scanner(System.in);
    private Album album=new Album();
    private static void menu(){
        System.out.println("PLAYLIST MENU!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("1.Add  songs in a playlist");
        System.out.println("2.Display Songs With the Album Name ");
        System.out.println("3.Skip Forward to the Next Song");
        System.out.println("4.Skip Backward to the previous Song");
        System.out.println("5.Replay the song");
        System.out.println("6.Print Main Menu");
        System.out.println("7. Exit");
        System.out.print("Enter Your Choice: ");

    }
    public void choiceselection() {
        int choice;
        menu();
        do {
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addingplaylist();
                    break;
                case 2:
                    displayallSongs();
                    break;
//                case 3:
//                    Forwardplaylist();
//                    break;
//                case 4:
//                    Backwardplaylist();
//                    break;
//                case 5:
//                    replay();
//                    break;
                case 6:
                    menu();
                    break;
                case 7:
                    break;
                default:
                    System.out.println("WRONG CHOICE!!!!!!!!!!!!!!!");


            }
        }while(choice!=7);
    }
    private void addingplaylist(){
        boolean Surity=true;
        while(Surity) {
            album.inputsongs();
            albums.add(album);
        }
    }
    private void displayallSongs(){

        for(int i=0;i<albums.size();i++){
            System.out.println("Album name is: "+ albums.get(i).getAlbumname());
            for(int j=0;j<album.getSongs().size();j++){
                System.out.println("Song Name is: "+ album.getSongs().get(j).getTitle());
                System.out.println("Duration is: "+album.getSongs().get(j).getDuration());
                System.out.println();
            }
        }
    }
}
