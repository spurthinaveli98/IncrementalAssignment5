package RegexCheck;

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class RegularExpression {
    private static final Logger log = Logger.getLogger(RegularExpression.class.getName());
    static String sentence;
    public static void main(String arg[]) {

            System.out.println("Enter string");
            Scanner s = new Scanner(System.in);
            sentence = s.nextLine();
            if (regexCheck(sentence))
                log.info("String matched with pattern");

            else
                log.info("String not matched with pattern");

    }

    /*
     * Checks if the sentence begins with a capital letter and ends with a period.
     * Returns true if it matches.
     * else false.
     */
   public static boolean regexCheck(String sentence) {
        final String regex = "^[A-Z].*\\.$";
        if (Pattern.matches(regex, sentence))
            return true;
        else
            return false;
    }

    public void setInput(String testSentence){

       sentence = testSentence;
    }

    public String getResult(boolean Flag){
        if(Flag)
            return "String matched with pattern";
        else
            return "String not matched with pattern";
    }
}

