package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: HP
 * Date: 24/7/12
 * Time: 2:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class ListAvaliableBooks {         //userInterface layer class responsible for displaying availabeBooks.
    ListAvaliableBooks(){}
    public boolean DisplayListOfAvaliableBooks(OutputDevice OD,BookCollection bookCollection){
            String output="list of all books:\n";
            for (int i = 0; i < bookCollection.books.size(); i++) {
                String book = bookCollection.books.get(i).getBookName();
                output += (i + 1) + "." + book +"\n";
            }
            output += "\n";
            OD.output(output);
            return true;

    }
}
