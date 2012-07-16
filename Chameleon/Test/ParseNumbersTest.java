import com.hacker.ParseNumbers;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: nazneenr
 * Date: 7/15/12
 * Time: 3:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class ParseNumbersTest {

    @Test
    public void test1ForCorrectConversionFromWordsToDigits()
    {
        ParseNumbers parseObj=new ParseNumbers();
        Assert.assertEquals(100,parseObj.parseNumbers("one hundred only"));
    }

    @Test
    public void test2ForCorrectConversionFromWordsToDigits()
    {
        ParseNumbers parseObj=new ParseNumbers();
        Assert.assertEquals(10100,parseObj.parseNumbers("ten thousand one hundred only"));
    }

    @Test
    public void test3ForCorrectConversionFromWordsToDigits()
    {
        ParseNumbers parseObj=new ParseNumbers();
        Assert.assertEquals(110100,parseObj.parseNumbers("one hundred ten thousand one hundred only"));
    }

    @Test
    public void test4ForCorrectConversionFromWordsToDigits()
    {
        ParseNumbers parseObj=new ParseNumbers();
        Assert.assertEquals(110104,parseObj.parseNumbers("one hundred ten thousand one hundred and four only"));
    }

    @Test
    public void testForCorrectConversionFromDigitsToWords()
    {
        ParseNumbers parseObj=new ParseNumbers();
        Assert.assertEquals("one hundred ten thousand one hundred and four only",parseObj.showOutput(110104));
    }

}
