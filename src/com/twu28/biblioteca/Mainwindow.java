package com.twu28.biblioteca;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: HP
 * Date: 12/7/12
 * Time: 8:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class Mainwindow {
    private final OutputDevice outputit;
    private final InputDevice inputit;
     private int selectedMenuItem;


    public Mainwindow(OutputDevice outputit, InputDevice inputit) {
       this.inputit=inputit;
        this.outputit=outputit;
        selectedMenuItem=99;
    }
    // public Mainwindow(){}
    public int DisplayMenu() {
            String[] menuItems = new BibliotecaReserve().menuItems().toArray(new String[]{});
            String output = "";
            for (int i = 0; i < menuItems.length; i++) {
                String menuItem = menuItems[i];
                output += (i + 1) + "." + menuItem + "\n";
            }
            output += "Select Menu Item:\t";

            outputit.output(output);
             return menuItems.length;
        }



    public int selectFromDisplay() {

            while (true) {
                DisplayMenu();
                 selectedMenuItem = inputit.readint();


                if (selectedMenuItem == 1) {
                    String[] books = new BibliotecaReserve().allBooks().toArray(new String[]{});
                    String output = "List of all the Books:\n";
                    for (int i = 0; i < books.length; i++) {
                        String book = books[i];
                        output += (i + 1) + "." + book + "\n";
                    }
                    output += "\n";
                    outputit.output(output);
                }
                else if (selectedMenuItem==2){
                    outputit.output("Please Enter the name of the book to reserve:\t");
                    String bookName=inputit.readInput();
                    List<String> books=new BibliotecaReserve().allBooks();
                    if(books.contains(bookName))
                        outputit.output("Thank You! Enjoy the book.\n");
                    else
                        outputit.output("Sorry we don't have that book yet");
                }

                else if(selectedMenuItem==3){

                        outputit.output("Please talk to Librarian.\nThank you.\n");
                }

                else if (selectedMenuItem == 4) {
                    outputit.output("Come Back Again Biblioteca.\n...Thank you...\n");
                    break;
                }

                else
                    outputit.output("Select a valid option!!!\n1");


            }
           return 1;
        }

    public static void main(String args[]){
        new Mainwindow(new OutputDevice(), new InputDevice()).selectFromDisplay();
    }

    public int ReturnselectMenuItemnum() {
       return this.selectedMenuItem;  //To change body of created methods use File | Settings | File Templates.
    }
}


