public class Main {
    public static void main(String[] args) {


        //arry is the rest of the string
        // we have to find the word start H or h and rest of the string with  Harry.

        System.out.println("harry".replaceAll("[Hh]arry","Harry"));
        String alphanumericString = "abcDeeeeF12Ghhiiiiijkl99z";

        // if we want to replace all the characters except e or j For eg
        System.out.println(alphanumericString.replaceAll("[^ej]","X")); // when we use a carrot inside
                                                                                        // square bracket it act like a character class not a boundary matcher.
         // in the square bracket the carrot class functionality reverses as the carrot ^   will check for the occurances that are not e or j and replace with X.


        //REGULAR EXPRESSION ARE CASE SENSETIVE
        // if we want to replace all the occurances that have words like abcDef345678

        System.out.println(alphanumericString.replaceAll("[abcdef345678]","X"));

        // another Method of doing this is if they are continuous is
        System.out.println(alphanumericString.replaceAll("[a-f 3-8]","X")); // we will get the same result as in the regex is [abcdef3456768].


        // for upperCase Version we write A-F
        System.out.println(alphanumericString.replaceAll("[a-f A-F 3-8]","X"));


        // for ignoring the case sensetivity and making the case insensetive
        System.out.println(alphanumericString.replaceAll("(?i)[a-f3-8]","X"));


        // for replacing any digit between 0-9 with X
        System.out.println(alphanumericString.replaceAll("[0-9]","X"));


        // Another method for replacing all the digits is \\d in the regex
        System.out.println(alphanumericString.replaceAll("\\d","X"));


        //Shortcut for replacing the all non digits   with X
        System.out.println(alphanumericString.replaceAll("\\D","X"));


        System.out.println();
        System.out.println();


        // trim method removes the white spaces from the beginning and the end of the string by default
        // For removing the occurance of the White Spaces at any of the Position in the  String we have

        String hasWhiteSpaces = "I have blanks and\ta tab and a newLine\n ";
        System.out.println(hasWhiteSpaces.replaceAll("\\s","")); // for removing all the blank Spaces and tabs and new line we use \\s.
        // \\s= no of spaces occuring  in the particular String

        // for removing the particular Spaces there are
        System.out.println(hasWhiteSpaces.replaceAll("\t","X"));
        // example for new Line Feed we have
        System.out.println(hasWhiteSpaces.replaceAll("\n","X"));

        // for removing the all non White Space Characters we have  \\S
        // only tab Spaces, new line Characters , remains .
        System.out.println(hasWhiteSpaces.replaceAll("\\S",""));

        // another Character Class is \\w
        // that matches a to z in lowercase, a to z in UpperCase , 0-9 and underscore(_)
        System.out.println(alphanumericString.replaceAll("\\w", "X"));
        System.out.println(hasWhiteSpaces.replaceAll("\\w","X"));

        // for opposite effect we have \\W
        System.out.println(alphanumericString.replaceAll("\\W", "X"));
        System.out.println(hasWhiteSpaces.replaceAll("\\W","X"));

        System.out.println();


        //for Matching the Word Boundaries We have /b
        // boundaries meaning   :- where the Word is starting and  ending for eg :- white spaces.
        System.out.println(hasWhiteSpaces.replaceAll("\\b","X"));

    }

}
