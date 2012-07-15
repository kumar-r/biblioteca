package com.twu28.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: HP
 * Date: 15/7/12
 * Time: 3:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReserveBook extends ViewAllBooks{
   static String userinput = null;
    public static void main(String[] args){
        for(int j=0;j<4;j++)  {
            System.out.println(book[j] + "   ");

        }
        System.out.println("enter the name of book to reserve");
        BufferedReader book = new BufferedReader(new InputStreamReader(System.in));


        try {
            userinput = book.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        choosebook("userinput");
   }

    public static boolean choosebook(String userinput) {
        for(String s : book)
        {
            if(userinput.equals(s))
            {
                 return true;
            }
            else
                return false;
        }
    return false;
    }
}
