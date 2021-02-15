import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {


    public static void main(String[] args) {
        LinkedList<String> placestovisit=new LinkedList<String>();
        placestovisit.add("Jammu And Kashmir");
        placestovisit.add("Himachal Pradesh");
        placestovisit.add("Bihar");
        placestovisit.add("west Bengal");
        placestovisit.add("Sikkim");
        placestovisit.add("Rajasthan");
        placestovisit.add("Karnataka");

        printList(placestovisit);
        placestovisit.add(1,"Darjeeling");//java is automatically adding
                                                       // record to the 2 position after the first element
                                                       // position so that the pointer of the
                                                       //first element now pointing towards Darjeeling.
        printList(placestovisit);
        placestovisit.remove(4);
        printList(placestovisit);// 5th element will be remove as 4th is pointing towards 5th element.

    }
    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i=linkedList.iterator();  //Iterator is a  another method of going
                                                   // through all the Record of the
                                                   //LinkedList,ArraysList,or any other type of list etc.

        while(i.hasNext()){
            System.out.println("Now Visiting: "+i.next());//LinkedList is a List that point towards another entry of the record
                                                            //i.hasnext is checking whether the rerord is pointing towards another record or it is empty
                                                             // and shows down the current record and i.next actually
                                                                //changes the value of the Iterator amd moves towards
                                                             //the next record just like i++ or i+=1
        }
        System.out.println("==============================");
    }
    private static void insertRecordAlphabetically(String newcity,LinkedList<String> linklist){
        ListIterator<String> listIterator=linklist.listIterator(); //Listiterator is a more specific iterator than a nornal iterator.
        while(listIterator.hasNext()){
                                                                    //has next meaning going through each and every record
            int comparison=listIterator.next().compareTo(newcity); // This line is for pointing towards the first record of the
                                                                   // list iterator as it is not pointing towards first record automatically.
                                                                  // it gives out an index position while is of type integer.
            if(comparison==0){
                // equal do not add
                System.out.println( newcity +" Destination is already reached ");
            }else if(comparison>0){
                //new city should be added before this one
                //west bangal-> Bihar
                listIterator.previous();
                listIterator.add(newcity);


            }else if(comparison<0){
                //move on to next city
                return;
            }

        }
        listIterator.add(newcity);


    }
}
