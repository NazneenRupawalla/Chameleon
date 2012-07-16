package com.hacker;

import java.util.Collections;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: nazneenr
 * Date: 7/9/12
 * Time: 7:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class Multiplication {
    public int computeValue(List<Integer> numericValueList)
    {
        int value=1;
        for(int list:numericValueList)
        {
            value=list*value;

        }
        return value;
    }
}
