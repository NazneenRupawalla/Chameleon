/**
 * Created by IntelliJ IDEA.
 * User: nazneenr
 * Date: 7/5/12
 * Time: 4:39 PM
 * To change this template use File | Settings | File Templates.
 */
package com.hacker;

import java.util.ArrayList;
import java.util.List;

public class WhiteHatHacker {

    private String input1;
    private int num;
    private List<Integer> numericValueList=new ArrayList<Integer>();
    private String input2;
    private String op;

    public WhiteHatHacker(String lineNum1, String lineNum2, String op) {
        this.input1=lineNum1;
        this.input2=lineNum2;
        this.op=op;
    }

    public void processInput() {
        // logic of parsing the numbers is present in ParseNumbers class
        ParseNumbers numericValues =new ParseNumbers();
        numericValueList.add(numericValues.parseNumbers(input1));
        numericValueList.add(numericValues.parseNumbers(input2));
       num=numericValues.performOp(op,numericValueList);
       System.out.println(numericValues.convertToWords(num));

    }
}
