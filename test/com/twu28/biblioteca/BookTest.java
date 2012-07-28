package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: HP
 * Date: 27/7/12
 * Time: 1:51 AM
 * To change this template use File | Settings | File Templates.
 */
public class BookTest {

    BookCollection bookcollection=new BookCollection();
    Book book=new Book(1,"abc", "xyz","pqr");
    @Test
    public void GetBookNameTest(){
        bookcollection.books.add(book);
        Assert.assertEquals("Harry Potter and the Philosophers Stone",bookcollection.books.get(0).getBookName());
    }
    @Test
    public void GetBookIdTest(){
        Assert.assertEquals(2,bookcollection.books.get(1).getBookId());
    }
    @Test
    public void GetReservationStatusTest(){
       bookcollection.books.get(0).reserve(true);
       Assert.assertTrue(bookcollection.books.get(0).ShowReservationStatus());
    }

}
