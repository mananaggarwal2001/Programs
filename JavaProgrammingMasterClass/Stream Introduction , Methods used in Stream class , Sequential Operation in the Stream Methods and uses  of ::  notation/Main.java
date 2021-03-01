import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> someBingoNumbers =  Arrays.asList(
                "N40", "N36",
                "B12","B6",
                "G53", "G49","G50","g69",
                "I26","I17","I29",
                "O71");

//        List<String> gNumbers = new ArrayList<>();
//
//
//        someBingoNumbers.forEach(number->{             // Number printing using lambda expression Starts With G
//            if(number.startsWith("G")){
//                gNumbers.add(number);
//                System.out.println(number);
//            }
//        });
//
//
//        System.out.println("==============================================================");
//
//        gNumbers.sort((String s1 , String s2) -> s1.compareTo(s2));
//        gNumbers.forEach((String s)-> System.out.println(s));


        // Stream Introduction

        someBingoNumbers
                .stream()
                // object type returned is of the stream type.
                .map(String::toUpperCase)
                // it is like we have to write s-> s.toUppercase(). s is the source string.
                // map accept only the functionality what we have to do to the source string object someBingoNumbers.
                // Map is used to transform the element of the collection like map , set etc.
                // Map method accept a Function Interface which accept a value and return a value of the same data type.
                // :: is called a Method Reference. In this the String is refering to the touppercase method  with no paranthesis ().
                .filter(s->s.startsWith("G"))

                // filter method accepts a predicate
                .sorted() // Natural order sorting
                .forEach(System.out::println);
             // method which returns a stream object  is called Intermediate stream because it does not force the end of the chain.
            // STREAM
           // for each method is from the stream method and foreach method of the stream is the terminal method.
          // we cant write filter before the map method because the filter method does not had  any possible manner to acess the startWith("G").

        // Stream Making from the Scratch


         Stream<String> ioNumberStream = Stream.of("I26","I17","I29","O70");            // of and concat method are static
         Stream<String> inNumberStream = Stream.of("N20","N36","I26","I17","I29","O29");
         Stream<String> concatStream = Stream.concat(ioNumberStream,inNumberStream);
//         System.out.println(concatStream.count()); // count all the values in the stream

        System.out.println("For distinct Values in the Stream");
        // for counting the distinct value of the stream.


        // Peak method of the stream
        // works like foreach but return a value.
        // Intermediate Stream operation.
        System.out.println(concatStream
                .distinct()
                .sorted()
                .peek(System.out::println)
                .count());

    }
}
