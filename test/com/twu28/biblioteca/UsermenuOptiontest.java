package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: HP
 * Date: 18/7/12
 * Time: 12:14 AM
 * To change this template use File | Settings | File Templates.
 */
public class UsermenuOptiontest {
    OutputDevice outputTestDevice=new OutputDevice();
    BookCollection bookCollection=new BookCollection();

    @Test
    public void DisplayListOfBookTest(){

        Assert.assertTrue(bookCollection.DisplayListOfBooks(outputTestDevice));
    }
    @Test
   public void BookAvailabilityTest(){
       int bookid=4;
       Assert.assertTrue(bookCollection.IsBookAvailable(bookid));

   }
     @Test
    public void LibIdExistsTest(){
         User user=new User();
         Assert.assertTrue(user.CheckLibNumber(1000));
     }
    @Test
    public void ReturnReservedBookTest(){
        User user=new User();
        user.SetEnteredBookAsBookReserved(5,bookCollection);
        Assert.assertTrue(user.ReturnReservedBook());
    }
}
