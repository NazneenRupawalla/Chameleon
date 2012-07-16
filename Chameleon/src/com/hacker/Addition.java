package com.hacker;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: nazneenr
 * Date: 7/9/12
 * Time: 6:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class Addition {
    public int computeValue(List<Integer> numericValueList)
    {
        int value=0;
        for(int list:numericValueList)
        {
            value=value+list;
        }
        return value;
    }


}
