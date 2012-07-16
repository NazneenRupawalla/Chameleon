/**
 * Created by IntelliJ IDEA.
 * User: nazneenr
 * Date: 7/5/12
 * Time: 4:40 PM
 * To change this template use File | Settings | File Templates.
 */
    package com.hacker;

    import java.util.HashMap;
    import java.util.Map;

    public class SingletonMap {

        private Map<String,Integer> map=null;
        private Map<String,Integer> mapOp=null;

        private static SingletonMap singletonObject;
        private SingletonMap() {
            map=new HashMap<String,Integer>();
            mapOp=new HashMap<String,Integer>();
            map.put("one", 1);
            map.put("two", 2);
            map.put("three", 3);
            map.put("four", 4);
            map.put("five", 5);
            map.put("six", 6);
            map.put("seven", 7);
            map.put("eight", 8);
            map.put("nine", 9);
            map.put("twenty", 20);
            map.put("thirty", 30);
            map.put("fourty", 40);
            map.put("fifty", 50);
            map.put("sixty", 60);
            map.put("seventy", 70);
            map.put("ten", 10);
            map.put("thousand", 1000);
            map.put("hundred", 100);


            map.put("eighty", 80);
            map.put("ninety", 90);

            mapOp.put("addition",1);
            mapOp.put("subtraction",2);
            mapOp.put("multiplication",3);

        }

        public static SingletonMap getSingletonObject() {
            if (singletonObject == null) {
                singletonObject = new SingletonMap();
            }
            return singletonObject;
        }

        public Map<String, Integer> getMapNumber() {
            return map;
        }

        public Map<String, Integer> getMapOp() {
            return mapOp;
        }

    }


