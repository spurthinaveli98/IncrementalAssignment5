import RegexCheck.RegularExpression;
import org.junit.Assert;
import org.junit.Test;

public class TestCase {
    @Test
    public void testcase1(){
        RegularExpression test=new RegularExpression();
        String sentence = "Welcome to TestCase1 of Regular Expression.";
        test.setInput(sentence);
        String expectedOutput="String matched with pattern";
        Boolean Flag = test.regexCheck(sentence);
        String actualOutput=test.getResult(Flag) ;
        Assert.assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void testcase2(){
        RegularExpression test=new RegularExpression();
        String sentence = "welcome to TestCase2 of Regular Expression.";
        test.setInput(sentence);
        String expectedOutput="String not matched with pattern";
        Boolean Flag = test.regexCheck(sentence);
        String actualOutput=test.getResult(Flag) ;
        Assert.assertEquals(expectedOutput,actualOutput);
    }

}