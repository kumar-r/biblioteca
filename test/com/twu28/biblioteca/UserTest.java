package com.twu28.biblioteca;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: HP
 * Date: 28/7/12
 * Time: 4:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserTest {
    BookCollection bookCollection=new BookCollection();
    Library library=new Library();
    User user=new User();
    @Test
    public void ReturnReservedBookTest(){
        library.reserveABookbyBookid(2,bookCollection,user);
        Assert.assertTrue(user.ReturnReservedBook(bookCollection));
    }
    @Test
    public void TestHasReserved(){
        library.reserveABookbyBookid(2,bookCollection,user);
        Assert.assertTrue(user.getHasReserved());
    }
}
