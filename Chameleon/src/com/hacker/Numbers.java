package com.hacker;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: nazneenr
 * Date: 7/15/12
 * Time: 4:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class Numbers {

    private Map<String, Integer> map=null;
    private Map<String,Integer> mapOp=null;

    public Numbers()
    {
        map=SingletonMap.getSingletonObject().getMapNumber();
        mapOp=SingletonMap.getSingletonObject().getMapOp();
    }
    public int getNumber(String numberInWords) {
        return map.get(numberInWords);
        
    }

    public int getOpValue(String operation) {
        return mapOp.get(operation);
    }


    public String getKey(int value) {
        for (String str : map.keySet()) {
            if (map.get(str).equals(value)) {
                return str;
            }
        }
        return null;

    }
}
