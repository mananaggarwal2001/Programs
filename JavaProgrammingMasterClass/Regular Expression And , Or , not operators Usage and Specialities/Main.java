import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // We can use 3 logical operators and , not ,or
        // and we are using implict as for example "abc" "a" and "b" and "c"
        // or operator example is :-
        System.out.println("Harry".replaceAll("[h|H]arry","Larry ")); // | is a or operator symbol.
        System.out.println("harry".replaceAll("[h|H]arry","Larry ")); // H or lowercase h consider a match.

        // Not operators versions
        // [^abc] :- In this version it will match all the characters except abc.
        // exclamation mark(!) is the symbol for the not Operator.

        // For example :- t's which are not followed by v's
//        String tvTest = "tstvtkt";
////        String tNotVRegExp = "t[^v]"; // Occurance 3 : Single T was not Found because when we use carrot ^ in the square bracket then the t must follow any character other than V.
//
//        String tNotVRegExp = "t(?!v)"; // ? mark is the part of the look ahead syntax and it says that we want that wasn't followed by the v.
//        // Applicable for those t's in the String that wasn't followed by any characters.
//        // look ahead syntax always start with the (?.
//        // look ahead syntax don't include characters they match this is called negative look ahead expression.
//        Pattern tNotVpattern = Pattern.compile(tNotVRegExp);
//        Matcher tNotVMatcher = tNotVpattern.matcher(tvTest);
//        int count=0;
//        while(tNotVMatcher.find()){
//            count++;
//            System.out.println(" Occurance " + count+ " : " + tNotVMatcher.start() + " to " + tNotVMatcher.end());
//        }

        // For positive look ahead expression we use equal sign rathar than !mark.
        String tvTest = "tstvtkt";
        String tNotVRegExp = "t(?!v)";
        Pattern tNotVpattern = Pattern.compile(tNotVRegExp);
        Matcher tNotVMatcher = tNotVpattern.matcher(tvTest);
        int count=0;
        while(tNotVMatcher.find()){
            count++;
            System.out.println(" Occurance " + count+ " : " + tNotVMatcher.start() + " to " + tNotVMatcher.end());
        }
        //t(?=v)

        // ^([\(]{1}[0-9]{3}[\)]{1}[ ]{1}[0-9]{3}[\-]{1}[0-9]{4})$
        String phone1 = "1234567890";  // Shouldn't match
        String phone2 = "(123) 456-7890"; // match
        String phone3 = "123 456-7890"; // Shouldn't match
        String phone4 = "(123)456-7890"; // Shouldn't match

        System.out.println("phone1 = " + phone1.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone2 = " + phone2.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone3 = " + phone3.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone4 = " + phone4.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));

        // ^4[0-9]{12}([0-9]{3})?$
        String visa1 = "4444444444444"; // should match
        String visa2 = "5444444444444"; // shouldn't match
        String visa3 = "4444444444444444";  // should match
        String visa4 = "4444";  // shouldn't match

        System.out.println("visa1 " + visa1.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa2 " + visa2.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa3 " + visa3.matches("^4[0-9]{12}([0-9]{3})?$"));
        System.out.println("visa4 " + visa4.matches("^4[0-9]{12}([0-9]{3})?$"));

    }
}
