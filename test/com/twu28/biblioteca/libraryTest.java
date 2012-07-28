package com.twu28.biblioteca;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: HP
 * Date: 27/7/12
 * Time: 1:34 AM
 * To change this template use File | Settings | File Templates.
 */
public class libraryTest {
    private Library library=new Library();
    private BookCollection bookcollection=new BookCollection();
    private User user=new User();
    private MovieCollection moviecollection=new MovieCollection();
    private UserDatabase Udb=new UserDatabase();
    @Test
    public void UserLoginTest(){
        Assert.assertEquals(1,library.UserLogin(Udb,1001,1111));
    }
    @Test
    public void ReserveAbookByBookIdtest(){
          Assert.assertTrue(library.reserveABookbyBookid(3, bookcollection, user));
        // Assert.assertTrue(library.reserveABookbyBookid(3, bookcollection, user));
           }
    @Test
    public void DisplaymainMenuTest(){
        Assert.assertEquals(99, library.DisplaymainMenu());
    }
    @Test
    public void ShowBooksInLibraryTest(){
        Assert.assertTrue(library.ShowBooksInLibrary(bookcollection));
    }
    @Test
    public void ShowMoviesInLibraryTest(){
        Assert.assertTrue(library.ShowMoviesInLibrary(moviecollection));
    }
    @Test
    public void WelcomeScreenTest(){
        Assert.assertTrue(library.ShowWelcomeScreen());
    }

}
