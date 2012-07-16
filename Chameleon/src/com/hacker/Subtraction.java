package com.hacker;

import java.util.Collections;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: nazneenr
 * Date: 7/9/12
 * Time: 7:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class Subtraction {
    
    public int computeValue(List<Integer> numericValueList)
    {
        int value=0;
        Collections.sort(numericValueList);
        //Collections.reverse(numericValueList);
        for(int list:numericValueList)
        {
            value=list-value;

        }
        return value;
    }
}
