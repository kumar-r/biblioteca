package com.twu28.biblioteca;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: HP
 * Date: 12/7/12
 * Time: 8:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class Mainwindow {

    public static void main(String[] args){

        System.out.println("this is new Biblioteca for Bangalore public library");
        System.out.println("1. see_All  2. Make_reservation  3. CheckDues  4. CheckLibraryNumber");
        System.out.println("enter your selection");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
         //checkselection(num);

    }

    public static boolean checkselection(int number) {
          if(number!=0)
            return true;
          else
              return false;

    }


}
