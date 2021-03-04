import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {


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


        System.out.println("------------------------------------------------------------------------");
        String h4pattern = "<h2>";
        Pattern pattern2 = Pattern.compile(h4pattern);
        Matcher matcher2 = pattern2.matcher(stringBuilder);
        System.out.println(matcher2.matches());
        // Introduction to the matcher Class start, find and the end method
        // start and end method return the range in which the regular expression is occuring .
        // start method is used to return the index of the first character in the match
        // end method is used to return the index of the last character after the match.
        // find method is used for finding the occurances in the pattern.
        // By Using the reset method we reset the internal state of the matcher class that has been set to the matches method
        // while printing the true or false and for reusing the matcher class.
        // KEEP IN MIND :- INDEX OF FIRST CHARACTER  COMES IN THE MATCH.END() METHOD IS THE INDEX AFTER THE MATCH.


        // For easy matching the regular expression what we called is the group
        // For using the group in the regular expression we use the paranthesis in the regular expression.
        // KEEP IN MIND :- PARANTHESIS ARE NOT COUNT FOR MATCHING IN THE REGULAR EXPRESSION.

        int count = 0;
        matcher.reset();
        while(matcher2.find()){
            count++;
            System.out.println("Occurance " + count + " : " + matcher2.start() + " to " + matcher2.end());
        }

        String h2GroupMatcher = "(<h2>.*?</h2>)";
        // * qantifier is called greeedy quantifier.
        //greedy quantifier means :- quantifier that will grab as much text as it want.
        // in this condition it will not stop at </h2> as it will grab as much text as it want until they matches the final condition which is </h2> and print them in console.

        // ? qantifier is the lazy quantifier. it will take one or zero occurances and doesn't take the entire text.
        // lazy quantifier means :- quantifier that not look for the further code in the
        // match as it takes the minimum amount of characters if they match in the lazy  quantifier.
        // we can't put the value 0 in the method group parameter because if we put then it will take the whole string as the group in the pattern.
        // group(0) is the entire character sequence.

        Pattern groupPattern = Pattern.compile(h2GroupMatcher);
        Matcher groupMatcher = groupPattern.matcher(stringBuilder);
        System.out.println(groupMatcher.matches());

        groupMatcher.reset();
        while(groupMatcher.find()){
            System.out.println("Occurance : " + groupMatcher.group(1));
        }

        // we can also use multiple groups in the regex expression for example
        String h2textGroup = "(<h2>)(.+?)(</h2>)";
        Pattern textPattern = Pattern.compile(h2textGroup);
        Matcher textMatcher = textPattern.matcher(stringBuilder);
        System.out.println(textMatcher.matches());

        textMatcher.reset();

        while(textMatcher.find()){
            System.out.println("Occurance : " + textMatcher.group(2));
        }
    }
}
