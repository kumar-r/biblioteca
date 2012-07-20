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
        outputit.output("1. View All Books");
        outputit.output("2. Reserve Your Book");
        outputit.output("3. Return Book");
        outputit.output("4. Check your Library number");
        outputit.output("5. View All Movies");
        outputit.output("6. Exit");

    }
}
