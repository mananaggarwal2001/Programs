import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );


    List<String> toUpperCaseList = new ArrayList<>();

    topNames2015.forEach(s -> {
        toUpperCaseList.add(s.toUpperCase());
        toUpperCaseList.sort(String::compareTo);
        toUpperCaseList.forEach(System.out::println);
    });

        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println();

        // Challenge 11

//        topNames2015.stream()
//                .map(String::toUpperCase)
//                .sorted()
//                .forEach(System.out::println);

    // Challenge 12

//        long charbeginninwithA=topNames2015.stream()
//                .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
//                .filter(s -> s.substring(0,1).equals("A"))
//                .count(); // Sequences takes place
//
//        System.out.println("Number of names beginning with A: " + charbeginninwithA);



        // Challenge 13


        topNames2015.stream()
                 .map(s -> s.substring(0,1).toUpperCase() + s.substring(1))
                .sorted(String::compareTo)
                .peek(System.out::println)
                .collect(Collectors.toList());

//        System.out.println(value);

    }
}
