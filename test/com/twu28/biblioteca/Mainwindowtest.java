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
     public void checkWelcomeMesssage(){
       Assert.assertEquals(99, Welcome.main());
     }
    @Test
     public void DisplayListOfMenuItemsTest(){
        InputDevice IN=new InputDevice();
        OutputDevice OD=new OutputDevice();
        Mainwindow MainW=new Mainwindow(OD, IN);
        Assert.assertEquals(4, MainW.DisplayMenu());
    }

    @Test
    public void SelectionOfMenuItemTest(){
        int integerassignedifmenuselected;
        InputDevice IN=new InputDevice();
        OutputDevice OD=new OutputDevice();
        Mainwindow MainW=new Mainwindow(OD,IN);
        integerassignedifmenuselected=MainW.ReturnselectMenuItemnum();
       // MainW.selectFromDisplay();
        Assert.assertEquals(99,integerassignedifmenuselected);
    }


}
