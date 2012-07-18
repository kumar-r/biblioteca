package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: HP
 * Date: 17/7/12
 * Time: 8:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class UsermenuOption {

    public void displayMenuOptions(OutputDevice outputit){    //user menu options a new menu can be added anytime
        outputit.output("View All Books");
        outputit.output("Reserve Your Book");
        outputit.output("Return Book");
        outputit.output("Check your Library number");
        outputit.output("Exit");

    }
}
