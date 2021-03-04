import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String alphanumericString = "abcDeeeF12Ghhiiiijkl99z";

        // QUANTIFIERS INTRODUCTION

        System.out.println(alphanumericString.replaceAll("abcDe{3}","X")); // Number indicating in the curly
        // braces is the Number of the preceding Character in the regex. In this case it is e which is occuring 3 times.
        //  QUANTIFIERS ALWAYS COME AFTER CHARACTERS THAT IS APPLIES TO KEEP IN MIND.

        System.out.println("------------------------------------------------------------------------");
        // if we want to replace one or more e occcuring in the String then we use plus(+) quantifiers
        // we dont need the curly braces in this quantifier because we are not providing the value.
        System.out.println(alphanumericString.replaceAll("abcDe+","YYY"));


        System.out.println("-------------------------------------------------------------------------");
        // we want to match the String followed by zero or more e in the String
        // We will use asterisk(*) quantifier in the regex expression .
        System.out.println(alphanumericString.replaceAll("^abcDe*","YYY"));
        // With zero number of the e we get the same result
        String secondalphanumericString = "abcDF12Ghhiiiijkl99z";
        System.out.println(secondalphanumericString.replaceAll("^abcDe*","YYY"));

        System.out.println("-------------------------------------------------------------------------");
          // if we want to change the experssion followed by the 2 to 5 e in the regex expression
         // if less than 2 or more than 5 the expression will remain adjatise .
        System.out.println(alphanumericString.replaceAll("^abcDe{2,5}","YYY"));

        System.out.println("-------------------------------------------------------------------------");
        // if we want to replace the quantifier followed by all occuranaces of h followed by any number of i followed by 1j we do
        System.out.println(alphanumericString.replaceAll("h+i*j","Y"));

        System.out.println("-------------------------------------------------------------------------");

        StringBuilder stringBuilder = new StringBuilder("<h1> My heading </h1>");
        stringBuilder.append("<h2> Sub Heading </h2>");
        stringBuilder.append("<p> This is a paragraph about Something </p>");
        stringBuilder.append("<p> This is another Paragraph about something else </p>");
        stringBuilder.append("<h2> Summary </h2>");
        stringBuilder.append("<p> Here is the Summary </p>");

        String h2pattern = "<h2>";
        Pattern pattern = Pattern.compile(h2pattern);
        Matcher matcher = pattern.matcher(stringBuilder);
        System.out.println(matcher.matches());  // matches() matches the string as the Whole and Then return true or false.

        // for matching the whole string we Use.
        String h3Pattern = ".*<h2>.*";
        Pattern pattern1 = Pattern.compile(h3Pattern);
        Matcher matcher1 = pattern1.matcher(stringBuilder);
        System.out.println(matcher1.matches());
    }
}
