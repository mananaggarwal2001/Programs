import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SETMAIN {
    public static void main(String[] args) {
//        Set<Integer> square=new HashSet<>();
//        Set<Integer> cubes=new HashSet<>();
//        for(int i=1;i<=100;i++){
//            square.add(i*i);
//            cubes.add(i*i*i);
//        }
//        System.out.println("There are " + square.size() + " squares " + cubes.size() + " cubes");
//        Set<Integer> Union=new HashSet<>(square);
//        Union.addAll(cubes);
//        System.out.println("Union contains " + Union.size()+ " elements");
//
//        Set<Integer> intersection=new HashSet<>(square);
//        intersection.retainAll(cubes);
//        System.out.println("Intersection sets contain " + intersection.size() + " elements");
//        // connection between the set and array.
//
//        Set<String> words=new HashSet<>();
//        String sentence="My name is manan aggarwal";
//        String[] arrayWords=sentence.split(" ");
//        words.addAll(Arrays.asList(arrayWords));

        Set<String> nature=new HashSet<>();
        Set<String> divine=new HashSet<>();
        String[] arraywords={"Naman","is","good","boy"};
        nature.addAll(Arrays.asList(arraywords));
        String[] arraywords2={"Naman","is","a","bad" ,"boy"};
        divine.addAll(Arrays.asList(arraywords2));

       Set<String> diff1=new HashSet<>(nature);
       System.out.println("nature-divine");
       diff1.removeAll(divine);
       printall(diff1);
        System.out.println();


        Set<String> diff2=new HashSet<>(divine);
        System.out.println("divine-nature");
        diff2.removeAll(nature);
        printall(diff2);


    }
    public static void printall(Set<String> elements){
        System.out.print("\t");
        for(String S:elements){
            System.out.print(S + " ");
        }
    }
}
