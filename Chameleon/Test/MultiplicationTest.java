import com.hacker.Multiplication;
import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: nazneenr
 * Date: 7/15/12
 * Time: 4:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class MultiplicationTest {
    @Test
    public void testForAdditionValue()
    {
        Multiplication mulOp=new Multiplication();

        List<Integer> listNumbers=new ArrayList<Integer>();
        listNumbers.add(10);
        listNumbers.add(20);
        listNumbers.add(30);
        Assert.assertEquals(6000, mulOp.computeValue(listNumbers));


    }

}
