import com.hacker.Subtraction;
import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: nazneenr
 * Date: 7/15/12
 * Time: 4:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class SubtractionTest {
    @Test
    public void testForAdditionValue()
    {
        Subtraction subOp=new Subtraction();

        List<Integer> listNumbers=new ArrayList<Integer>();
        listNumbers.add(10);
        listNumbers.add(2000);
        listNumbers.add(340);
        Assert.assertEquals(1670, subOp.computeValue(listNumbers));


    }

    @Test
    public void test2ForAdditionValue()
    {
        Subtraction subOp=new Subtraction();

        List<Integer> listNumbers=new ArrayList<Integer>();
        listNumbers.add(10);
        listNumbers.add(10);
        listNumbers.add(40);
        Assert.assertEquals(40, subOp.computeValue(listNumbers));


    }

}
