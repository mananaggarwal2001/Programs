public class Main {
    public static void main(String[] args) {
        String string = "I am a String Yes I,am";
        //Regular Expression introduction
        String YourString = string.replaceAll("I","You");     // A single Word is a regular Expression like in here is "Hello".
        System.out.println(YourString);

        String alphanumeric = "abcDeeeef12GHiiiiiiiiiiK92";
        System.out.println(alphanumeric.replaceAll("^abcDeee","YYY"));  // ^ -> is a carrot boundary matcher for finding the match at the Starting of the String
                                                                                       // carrot boundary matcher only  looks for the start of the String
                                                                                        // both parameter in replaceAll method is  length independent

                                                                                // Carrot boundary matcher to a I is used for replacement of the
                                                                                // String either a  part o the String or Whole
                                                                                // String with the replacement condition
                                                                               //  implements the sets or class of Character like in this YourString class
                                                                                // it requires the Whole String for a regex match not a part of the String

        String secondString  = "abcDeeeef12GHabcDeeeeiiiiiiiiiiK92";
        System.out.println(secondString.replaceAll("abcDeeee","YYY")); // without carrot Boundary Matcher
        System.out.println(secondString.replaceAll("^abcDeeee","YYY"));// with carrot boundary Matcher
                                                                                        // only starting of the String is matched
// Matches method in String the that accepts a regular Expression and retures boolean Value for example.

        System.out.println(secondString.matches("Hello"));
        System.out.println(secondString.matches("^abcDeeee")); // matches method matches the entire
                                                                    // String to the regular expression
                                                                    // and then return the value true.

        System.out.println(secondString.matches("abcDeeeef12GHabcDeeeeiiiiiiiiiiK92")); // return true.
        System.out.println(secondString.matches("^abcDeeeef12GHabcDeeeeiiiiiiiiiiK92"));

        // dollar matches the String at the end
        System.out.println(secondString.matches("iK92$"));  // dollar also matches the entire String at the end and returns true.
        System.out.println(secondString.replaceAll("iK92$","THE END"));

        // to replace all the occured letters or combination of the letters   we use words within the square brackets
        System.out.println(secondString.replaceAll("[abc]","X"));// Regex meaning is a target word From which we want to replace by Which word.
        // here replaceAll method takes two Parameter regex,replacement.


        // both parameter in replaceAll method is  length independent
        // for example
        System.out.println(secondString.replaceAll("[abc]","I am replaced"));

        // if we Want to replace the [aei] followed by the [fj]
        // both characters which is (before F or before J) and (F or J) is replaced with "Y"
        // only letter which is just before the F or J the replacement condition is applied.
        // Example
        System.out.println(secondString.replaceAll("[aei][fj]","Y"));

    }

}
