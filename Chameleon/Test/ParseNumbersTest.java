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
    public void test1ForCorrectConversionFromWordsToDigitsLessThanThousand()
    {
        ParseNumbers parseObj=new ParseNumbers();
        Assert.assertEquals(100,parseObj.parseNumbers("one hundred only"));
    }
    
    @Test
    public void testConversionOfNumbersToWordsLessThan100()
    {
        ParseNumbers parseObj=new ParseNumbers();
        Assert.assertEquals("ninety nine only",parseObj.convertToWords(99));
    }

    @Test
    public void testConversionOfNumbersToWordsLessThan1000()
    {
        ParseNumbers parseObj=new ParseNumbers();
        Assert.assertEquals("one hundred and ninety nine only",parseObj.convertToWords(199));
    }

    @Test
    public void testConversionOfNumbersToWordsLessThan10000()
    {
        ParseNumbers parseObj=new ParseNumbers();
        Assert.assertEquals("ten thousand one hundred and ninety nine only",parseObj.convertToWords(10199));
    }

    @Test
    public void test2ConversionOfNumbersToWordsLessThan10000()
    {
        ParseNumbers parseObj=new ParseNumbers();
        Assert.assertEquals("ninety one thousand one hundred and ninety nine only",parseObj.convertToWords(91199));
    }

    @Test
    public void testForCorrectConversionOfWordsToNumbersLessThan10000()
    {
        ParseNumbers parseObj=new ParseNumbers();
        Assert.assertEquals(10100,parseObj.parseNumbers("ten thousand one hundred only"));
    }

    @Test
    public void testForCorrectConversionFromWordsToDigitsLessThanHundredThousand()
    {
        ParseNumbers parseObj=new ParseNumbers();
        Assert.assertEquals(110100,parseObj.parseNumbers("one hundred ten thousand one hundred only"));
    }

    @Test
    public void testForCorrectConversionFromWordsToDigits()
    {
        ParseNumbers parseObj=new ParseNumbers();
        Assert.assertEquals(110104,parseObj.parseNumbers("one hundred ten thousand one hundred and four only"));
    }

    @Test
    public void testForCorrectConversionFromDigitsToWords()
    {
        ParseNumbers parseObj=new ParseNumbers();
        Assert.assertEquals("one hundred ten thousand one hundred and four only",parseObj.convertToWords(110104));
    }


}