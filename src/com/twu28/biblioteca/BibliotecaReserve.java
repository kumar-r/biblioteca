package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: HP
 * Date: 17/7/12
 * Time: 12:20 AM
 * To change this template use File | Settings | File Templates.
 */
    public class BibliotecaReserve {
        public List<String> menuItems() {
            ArrayList<String> menuItems=new ArrayList<String>();
            menuItems.add("View All Books");
            menuItems.add("Reserve your Book");
            menuItems.add("Check your Library Number");
            menuItems.add("Exit");
            return menuItems;
        }

        public List<String> allBooks() {
            ArrayList<String> books=new ArrayList<String>();
            books.add("Head First Java");
            books.add("Apprenticeship Patterns");
            books.add("Alice in Wonderland");
            books.add("The immortals of Meluha");
            books.add("Gone with the Wind");
            books.add("Java The Complete Reference: Herbert Schildt");
            return books;
        }

        public List<String> allLibraryNumbers() {
            ArrayList<String> libraryNumbers=new ArrayList<String>();
            libraryNumbers.add("4NI08CS063");
            libraryNumbers.add("4NI09CS068");
            libraryNumbers.add("4NI07CV065");
            return libraryNumbers;
        }
    }



