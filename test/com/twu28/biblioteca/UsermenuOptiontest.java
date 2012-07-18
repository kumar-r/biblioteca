package com.twu28.biblioteca;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created with IntelliJ IDEA.
 * User: HP
 * Date: 18/7/12
 * Time: 12:14 AM
 * To change this template use File | Settings | File Templates.
 */
public class UsermenuOptiontest extends TestCase {
    OutputDevice outputTestDevice=new OutputDevice();
    public void TestIfMenuIsDisplayed(){
    Mainwindow MW=new Mainwindow();
    Assert.assertEquals(99,MW.DisplayListOfMenuOptions(outputTestDevice));
 }

}
