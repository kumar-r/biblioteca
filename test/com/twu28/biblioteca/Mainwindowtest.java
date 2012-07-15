package com.twu28.biblioteca;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: HP
 * Date: 14/7/12
 * Time: 5:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class Mainwindowtest{
    public boolean buttonAsserted=false;
    @Test
      public void checkifMenuSelected(){
        Mainwindow  window=new Mainwindow();
        buttonAsserted = window.checkselection(0);
        Assert.assertTrue(buttonAsserted);
    }

    @Test
     public void checkWelcomeMesssage(){
        Welcome window=new Welcome(3000);
        Assert.assertEquals(true, window.DisplayDidWelcome());
    }

     @Test
      public void ViewAllBookTest(){
         int numberOfBooks=4;
         ViewAllBooks VW=new ViewAllBooks();
         Assert.assertEquals(numberOfBooks,VW.showNumOfBooks());
        // int n = VW.shownumofbooks();
     }
    @Test
       public void ReserveBookTest(){
         ReserveBook RB=new ReserveBook();
        Assert.assertEquals(true,RB.choosebook("abc"));
        System.out.println("Your selected book: abc has been reserved");
    }

}
