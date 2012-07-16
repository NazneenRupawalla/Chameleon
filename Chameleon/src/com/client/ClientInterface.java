/**
 * Created by IntelliJ IDEA.
 * User: nazneenr
 * Date: 7/5/12
 * Time: 4:37 PM
 * To change this template use File | Settings | File Templates.
 */
    package com.client;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;

    import com.hacker.WhiteHatHacker;

    public class ClientInterface {

        public static void main(String[] args) throws IOException {
            takeInput();
        }

        private static void takeInput() throws IOException {

            //function to take in the input for the required numbers and operation

            System.out.println("Enter number 1");
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
            String number1=br.readLine();
            System.out.println("Enter number 2");
            String number2=br.readLine();
            System.out.println("Operation");
            String op=br.readLine();
            //WhiteHatHacker processes the input
            WhiteHatHacker hack=new WhiteHatHacker(number1,number2,op);
            hack.processInput();
        }

    }

