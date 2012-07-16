/**
 * Created by IntelliJ IDEA.
 * User: nazneenr
 * Date: 7/5/12
 * Time: 4:40 PM
 * To change this template use File | Settings | File Templates.
 */
    package com.hacker;

    import java.util.Collections;
    import java.util.LinkedList;
    import java.util.List;
    import java.util.Map;
    import java.util.Queue;
    import java.util.Stack;
    import java.util.StringTokenizer;

    public class ParseNumbers {

        private Queue<String> queue = new LinkedList<String>();
        private Stack<Integer> stack=new Stack<Integer>();
        private Boolean flag=false;
        private int finalNumber;
        private int count;
        private StringBuilder strBd=new StringBuilder();

//        Map<String, Integer> map=null;
//        Map<String, Integer> mapOp=null;

        //private String wordNumber;
        private int num;
        private int value;
        private Integer numberMap;
        private int len=7;
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
            StringTokenizer strTok =new StringTokenizer(input," ");
            while(strTok.hasMoreElements())
            {
                String number=(String)strTok.nextElement();
                if(number.equals("thousand"))
                {
                    count=numbers.getNumber(number);
                    //count=map.get(number);
                    if(flag)
                    {
                        finalNumber=count*finalNumber;
                        flag=false;
                    }


                    num=numbers.getNumber(queue.poll());
                    finalNumber=finalNumber+(num*count);
                    if(queue.size()!=0)
                    {
                        num=numbers.getNumber(queue.poll());
                        finalNumber=finalNumber+(num*count);
                    }

                }
                else if(number.equals("hundred"))
                {
                    count=numbers.getNumber(number);
                    //count=map.get(number);

                    num=numbers.getNumber(queue.poll());
                    finalNumber=finalNumber+(num*count);
                    flag=true;
                    /*if(finalNumber==0)
                    {
                        num=getNumber(wordNumber);
                        count=count*1000;
                        finalNumber=finalNumber+(num*count);
                        //flag=false;

                    }
                    else
                    {

                        num=getNumber(wordNumber);
                        //count=count*1000;
                        finalNumber=finalNumber+(num*count);
                    }*/
                }

                else if(!(number.equals("only")) && (!(number.equals("and"))))
                {
                    queue.add(number);
                }
            }
            if(queue.size()!=0)
            {
                if(queue.size()==2)
                {
                    num=numbers.getNumber(queue.poll());
                    finalNumber=finalNumber+num;
                }
                num=numbers.getNumber(queue.poll());
                finalNumber=finalNumber+num;
            }

            return finalNumber;
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


        //function to convert numeric values back to words
        public String showOutput(int finalNumber) {

            while(finalNumber!=0)
            {
                int stackNum=finalNumber%10;
                stack.push(stackNum);
                finalNumber=finalNumber/10;
            }
            return convertToWords(finalNumber);
        }

        private String convertToWords(int finalNumber)
        {
            len=stack.size();
            String denomination=null;
            do
            {
                numberMap=stack.pop();
                if(numberMap!=0)
                {

                    switch(len)
                    {

                        case 6:
                            produceString(numberMap,"hundred");
                            denomination="thousand";
                            break;
                        case 5:
                            produceString((numberMap*10),null);
                            denomination="thousand";
                            break;
                        case 4:
                            denomination=null;
                            produceString(numberMap," thousand");
                            denomination="and";
                            break;
                        case 3:
                            produceString(numberMap,"hundred");
                            denomination="and";
                            break;
                        case 2:
                            strBd.append("and ");
                            produceString((numberMap*10),null);
                            denomination=null;
                            break;
                        case 1:
                            produceString(numberMap,null);
                            break;

                    }
                }
                else{
                    if(denomination!=null)
                    {
                        strBd.append(" "+denomination);
                        denomination=null;
                    }
                }
                len=stack.size();

            }while(len!=0);
            strBd.append(" only");
            return strBd.toString();
            //System.out.println(strBd.toString());
        }


//        private String getKeyFromValue(Map<String, Integer> map, int numberMap) {
//            for (String str : map.keySet()) {
//                if (map.get(str).equals(numberMap)) {
//                    return str;
//                }
//            }
//            return null;
//
//        }

//        private int getNumber()
//        {
//            this.wordNumber =queue.poll();
//            //System.out.println(wordNumber);
//            num=map.get(this.wordNumber);
//            return num;
//
//        }

        public void produceString(int number,String denomination)
        {
            strBd.append(numbers.getKey(number)+" ");
            if(denomination!=null){
            strBd.append(" " + denomination);
            }
        }

    }


