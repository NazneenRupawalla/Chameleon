/**
 * Created by IntelliJ IDEA.
 * User: nazneenr
 * Date: 7/5/12
 * Time: 4:40 PM
 * To change this template use File | Settings | File Templates.
 */
package com.hacker;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class ParseNumbers {

    private Queue<String> queue = new LinkedList<String>();
    private Boolean flag=false;
    private int finalNumber;
    private int count;
    private StringBuilder strBd=new StringBuilder();
    private int num;
    private int value;
    private Integer numberMap;
    private Numbers numbers=null;

    public ParseNumbers()
    {
        numbers=new Numbers();
    }

    //function to convert words to numbers
    public int parseNumbers(String input) {

        finalNumber=0;
        count=1;
        flag=false;
        StringTokenizer strTok = new StringTokenizer(input," ");
        while(strTok.hasMoreElements())
        {
            String stringToken=(String)strTok.nextElement();
            if(stringToken.equals("thousand"))
            {
                count=numbers.getNumber(stringToken);
                if(flag)
                {
                    finalNumber=count*finalNumber;
                    flag=false;
                }

                calculateFinalNumber();
                if(queue.size()!=0)
                {
                    calculateFinalNumber();
                }
            }
            else if(stringToken.equals("hundred"))
            {
                count=numbers.getNumber(stringToken);
                calculateFinalNumber();
                flag=true;
            }
            else if(!(stringToken.equals("only")) && (!(stringToken.equals("and"))))
            {
                queue.add(stringToken);
            }
        }
        while(queue.size()!=0)
        {
            num=numbers.getNumber(queue.poll());
            finalNumber=finalNumber+num;
        }

        return finalNumber;
    }

    private void calculateFinalNumber() {
        num=numbers.getNumber(queue.poll());
        finalNumber=finalNumber+(num*count);
    }


    //function to iterate the list which stores the numeric values of the numbers entered in
    public int performOp(String op, List<Integer> numericValueList) {
        switch(numbers.getOpValue(op))
        {
            case 1://addition
                Addition add=new Addition();
                value=add.computeValue(numericValueList);
                break;
            case 2://subtraction
                Subtraction sub=new Subtraction();
                value=sub.computeValue(numericValueList);
                break;
            case 3:	//multiplication
                Multiplication mul=new Multiplication();
                value=mul.computeValue(numericValueList);
                break;

        }
        return value;

    }


    public String convertToWords(int finalNumber)
    {

        if(finalNumber<=100)
        {
            convertNumberLessThanHundredToWords(finalNumber);
        }
        else if(finalNumber<=1000)
        {
            convertNumberLessThanThousand(finalNumber);
        }
        else if(finalNumber<=100000)
        {
            convertNumberLessThanHundredThousand(finalNumber);
        }
        else
        {
            numberMap=finalNumber/100000;
            produceString(numberMap,"hundred ");
            finalNumber=finalNumber%100000;
            convertNumberLessThanHundredThousand(finalNumber);

        }

        strBd.append("only");
        return strBd.toString();
    }

    private void convertNumberLessThanHundredThousand(int finalNumber) {
        convertNumberLessThanHundredToWords(finalNumber/1000);
        strBd.append("thousand ");
        System.out.println(finalNumber%1000);
        convertNumberLessThanThousand(finalNumber % 1000);
    }

    private void convertNumberLessThanThousand(int finalNumber) {
        numberMap=finalNumber/100;
        produceString(numberMap,"hundred and ");
        finalNumber=finalNumber%100;
        convertNumberLessThanHundredToWords(finalNumber);
    }

    private void convertNumberLessThanHundredToWords(int finalNumber) {
        numberMap=finalNumber/10;
        produceString(numberMap*10,null);
        finalNumber=finalNumber%10;
        numberMap=finalNumber;
        produceString(numberMap,null);
        finalNumber=finalNumber/10;
        System.out.println(finalNumber);
    }


    public void produceString(int number,String denomination)
    {
        if(number!=0)
        {
            strBd.append(numbers.getKey(number)+" ");
            if(denomination!=null){
                strBd.append(denomination);
            }
        }
    }

}


