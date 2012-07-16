import com.hacker.Numbers;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: nazneenr
 * Date: 7/15/12
 * Time: 4:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class NumbersTest {

    @Test
    public void testForCorrectValueFromMap()
    {
        Numbers numberObj = new Numbers();
        Assert.assertEquals(10,numberObj.getNumber("ten"));
    }

    @Test
    public void testForCorrectOpValueFromMapOp()
    {
        Numbers numberObj = new Numbers();
        Assert.assertEquals(1,numberObj.getOpValue("addition"));

    }

    @Test
    public void testForCorrectKeyFromValue()
    {
        Numbers numberObj = new Numbers();
        Assert.assertEquals("thousand",numberObj.getKey(1000));

    }

    @Test
    public void testForNotKeyFromValue()
    {
        Numbers numberObj = new Numbers();
        Assert.assertEquals(null,numberObj.getKey(100000000));

    }
}
