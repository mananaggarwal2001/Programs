import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String challenge1 = "I want a bike.";
        // challenge 1 answers
        System.out.println(challenge1.matches(".*[a-z]*."));
        System.out.println(challenge1.matches("I want a bike."));

        // challenge 2 and 3 answers
        String challenge2 = "I want a bike.";
        String challenge3 = "I want a Ball.";

        String regex = "I want a (.*)";
        System.out.println(challenge2.matches(regex));
        System.out.println(challenge3.matches(regex));

        // or we can write

        String regex2 = "I want a \\w+.";
        System.out.println(challenge2.matches(regex2));
        System.out.println(challenge3.matches(regex2));

        // or we can write

        String regex3 = "I want a (bike|(?i)ball).";
        System.out.println(challenge2.matches(regex3));
        System.out.println(challenge3.matches(regex3));
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println();
        // challenge 3 by using the matcher class
        String regex4 = "I want a (bike|(?i)ball).";
        Pattern pattern = Pattern.compile(regex4);
        Matcher matcher = pattern.matcher(challenge2);
        System.out.println(matcher.matches());
        matcher = pattern.matcher(challenge3);
        System.out.println(matcher.matches());

        // challenge 4

        String challenge5 = "Replace all blanks with underscore";
        System.out.println(challenge5.replaceAll(" ", "_"));
        System.out.println(challenge5.replaceAll("\\s", "_"));

        // challenge 5
        String challenge6 = "aaabccccccccdddefffg";
        System.out.println(challenge6.matches("[a-z]+"));

        // challenge 6
        System.out.println("----------------------------------------------");
        System.out.println(challenge6.matches("aaabccccccccdddefffg"));
        System.out.println(challenge6.matches("^a{3}bc{8}d{3}ef{3}g$"));

        // challenge 7
        System.out.println("-----------------------------------------------");
        String regex5 = "[(?i)a-z]+\\.\\d+$";  // \\. (Period character class ) This special regex expression is used
        // when we have to escape the match character In this case it is the dot character.
        System.out.println("abcd.1234".matches(regex5));

        // challenge 8
        System.out.println("-----------------------------------------------");
//        String regex6 = "([a-z]{4})(\\.[0-9]{3}\\w{4})(\\.\\d\\w{4})(\\.\\d{3})";
        String regex6 = "((?i)[a-z]+)\\.(\\d+)";
        String testString = "abcd.135uvqz.7tzik.999";
        Pattern pattern1 = Pattern.compile(regex6);
        Matcher matcher1 = pattern1.matcher(testString);
        int count = 0;
        while (matcher1.find()) {
            count++;
            System.out.println("Occurence : " + count + " : " + matcher1.group(2));  // group(1) the number of the group refers to the paranthesis group in the regex expression for what we have to match.

        }


        // String challenge 9

        System.out.println("---------------------------------------------------------");
        String challenge9 = "abcd.145\ttuvqz.7\tttzik.999\n";
        String regex7 = "((?i)[a-z]+)\\.(\\d+)\\s";
        Pattern pattern2 = Pattern.compile(regex7);
        Matcher matcher2 = pattern2.matcher(challenge9);
        int count1 = 0;
        while (matcher2.find()) {
            count1++;
            System.out.println("Occurance " + count1 + " : " + matcher2.group(2));
        }


        // String challenge 10 for printing the start and end indices of the number
        System.out.println("-----------------------------------------------------");
        matcher2.reset();
        count1 = 0;
        while (matcher2.find()) {
            count1++;
            System.out.println("Occurance " + count1 + " : " + matcher2.start(2) + " and the end index is the: " + (matcher2.end(2) - 1));

        }

        System.out.println("--------------------------------------------------------");
        // challenge 11 Extracting String in the curly braces

        String challenge11 = "{0,2},{0,5},{1,3},{2,4}";
        String regexp = "\\{(.*?)\\}";                 // \\ is mainly used for escaping any of the special symbol.
        Pattern pattern3 = Pattern.compile(regexp);
        Matcher matcher3 = pattern3.matcher(challenge11);
        while (matcher3.find()) {
            System.out.println("Occurance: " + matcher3.group(1));
        }
        System.out.println();
        System.out.println("Alternative Solution is the : ");
        System.out.println();

        challenge11 = "{0,2},{0,5},{1,3},{2,4},{x,y},{11,12},{13,14}";  // in the braces type regular expression it
        // will skip all the characters other than digits and the output will be shown.

        regexp = "\\{(\\d+,\\d+)\\}";
        pattern3 = Pattern.compile(regexp);
        matcher3 = pattern3.matcher(challenge11);
        matcher3.reset();
        while (matcher3.find()) {
            System.out.println("Occurance: " + matcher3.group(1));
        }


        // challenge no 12

        System.out.println("***********************************************");
        String TestString = "35450";
        String regexText = "(^\\d{5}$)";
        Pattern pattern4 = Pattern.compile(regexText);
        Matcher matcher4 = pattern4.matcher(TestString);
        while (matcher4.find()) {
            System.out.println("Occurance: " + matcher4.group(1));
        }


        // challenge no 13

        System.out.println("=================================================");
        String TestString1 = "11111-1111";
        System.out.println(TestString1.matches("^\\d{5}\\-\\d{4}$"));

        // challenge no 14

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        String optionalRegex = "^\\d{5}$|^\\d{5}-\\d{4}$";
        optionalRegex="^\\d{5}(-\\d{4})?$";   // here question mark means that the there will be option for the group to be choosen either 0 or 1 according to the Situation.
        System.out.println("11111".matches(optionalRegex));
        System.out.println("11111-1111".matches(optionalRegex));

        // FOR GROUPS QUESTION MARK WILL REFER AS THE OPTION CHOOSER EITHER 0 OR 1 .


    }

}

