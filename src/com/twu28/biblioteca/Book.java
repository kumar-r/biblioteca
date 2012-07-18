package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: HP
 * Date: 17/7/12
 * Time: 7:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class Book {
    int BookId;
    public String bookName;
    public String publisher;
    public String author;
    boolean IsReserved;

    public Book(int BookId,String bookName, String Publisher,String author){
        this.BookId=BookId;
        this.bookName=bookName;
        this.publisher=Publisher;
        this.author=author;
        this.IsReserved=false;
    }
}
