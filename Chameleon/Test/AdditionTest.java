import com.hacker.Addition;
import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: nazneenr
 * Date: 7/15/12
 * Time: 4:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class AdditionTest {
    @Test
    public void testForAdditionValue()
    {
        Addition addOp=new Addition();

        List<Integer> listNumbers=new ArrayList<Integer>();
        listNumbers.add(10);
        listNumbers.add(2000);
        listNumbers.add(340);
        Assert.assertEquals(2350,addOp.computeValue(listNumbers));


    }

}
