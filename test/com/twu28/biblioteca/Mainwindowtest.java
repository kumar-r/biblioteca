package com.twu28.biblioteca;


//import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: HP
 * Date: 18/7/12
 * Time: 12:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class MainwindowTest{
    OutputDevice OD=new OutputDevice();
    @Test
    public void WelcomeTest(){
    Mainwindow Mw=new Mainwindow();
    Assert.assertTrue(Mw.ShowWelcomeScreen());
  }
    @Test
    public void ListofMenuItemsTest(){
        Mainwindow Mw=new Mainwindow();
        Assert.assertEquals(99,Mw.DisplayListOfMenuOptions(OD));
    }

}