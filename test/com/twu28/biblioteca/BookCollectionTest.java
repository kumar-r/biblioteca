package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: HP
 * Date: 28/7/12
 * Time: 5:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class BookCollectionTest {
    BookCollection bookCollection=new BookCollection();
    @Test
    public void AddABookToCollectionTest(){
        bookCollection.AddNewBook(11,"abc","xyz","pqr");
        Assert.assertEquals("abc",bookCollection.books.get(10).getBookName());
    }
    @Test
    public void DeleteABookFromCollection()throws IndexOutOfBoundsException{
        try{
            bookCollection.RemoveBook(11);           //since '11' is the last index of the list,
            Assert.assertTrue(bookCollection.books.get(11).IsBookAvailable(11));    //after deletion an exception will be thrown.
        }catch (IndexOutOfBoundsException E){System.out.println("Exception thrown: trying to access list");}
    }
}