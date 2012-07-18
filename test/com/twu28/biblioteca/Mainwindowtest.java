package com.twu28.biblioteca;

//import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Assert;

/**
 * Created with IntelliJ IDEA.
 * User: HP
 * Date: 18/7/12
 * Time: 12:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class MainwindowTest extends TestCase {
    public void TestIfSelectionIsValid(){
    Mainwindow Mw=new Mainwindow();
    Assert.assertEquals("",Mw.selectedMenuItem);
  }
}