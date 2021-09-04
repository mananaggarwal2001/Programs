import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Theatre theatre=new Theatre("Gaur city",8,13);
        List<Theatre.Seat> seatcopy=new ArrayList<>(theatre.seats);
        printlist(seatcopy);
        Collections.reverse(seatcopy);
        System.out.println("Printing seatcopy");
        printlist(seatcopy);
        System.out.println("Printing Theatre.seats ");
        printlist(theatre.seats);
        Collections.shuffle(seatcopy);
        System.out.println("Printing list in the pseudo random order");
        printlist(seatcopy);

        List<Theatre.Seat> list=new ArrayList<>(); // it only allocate the size of the array list giving it potential to hold the values in the list.
                                                                        //but initially containing none.So it still doesnt create the actual no of elements.
        // Collections.copy(list,theatre.seats);                           // actually if we want to copy to work we actually have 96 seeds objects in the list.


        List<Theatre.Seat> pricelist=new ArrayList<>(theatre.seats);
        pricelist.add(theatre.new Seat("B00",12));
        pricelist.add(theatre.new Seat("B01",20));
        pricelist.add(theatre.new Seat("F02",14));
        Collections.sort(pricelist,Theatre.PRICE_ORDER);
        printlist(pricelist);
    }
    public static void printlist(List<Theatre.Seat> list){
        for(Theatre.Seat obeject:list){
            System.out.print(" "+obeject.getSeatNumber()+" "+obeject.getPrice());
        }
        System.out.println();
        System.out.println("==================================================================================");
    }
}
