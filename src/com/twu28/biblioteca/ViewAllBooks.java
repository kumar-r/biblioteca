package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: HP
 * Date: 15/7/12
 * Time: 3:21 AM
 * To change this template use File | Settings | File Templates.
 */
public class ViewAllBooks {
   static String[] book = new String[]{"abc", "DBMS: practical approach", "java: herbert schild", "practice in programming"};

    public static void main(String[] args){

               //System.out.println("These are elements of one Dim array.");
        for (int i = 0; i < book.length; i++) {
            System.out.println(book[i] + "   ");
        }

    }

    public int showNumOfBooks() {
        return 4;
    }
}
