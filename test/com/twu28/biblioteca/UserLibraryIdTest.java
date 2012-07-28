package com.twu28.biblioteca;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: HP
 * Date: 28/7/12
 * Time: 3:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserLibraryIdTest {
    User user= new User(1006,1116);
    @Test
    public void  TestForCorrectLibraryIdFromUsernamePassword(){
        Assert.assertEquals("1006-1116",(user.userLibraryId()));
    }
    @Test
    public void TestforCorrectUsername(){
    Assert.assertEquals(1006,user.userUsername());
}
    @Test
    public void TesytforCorrectPassword(){
        Assert.assertEquals(1116,user.userPassword());
    }
}
