package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: HP
 * Date: 17/7/12
 * Time: 7:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class Book {
    private int BookId;
    private String bookName;
    private String publisher;
    private String author;
    private boolean IsReserved;


    public Book(int BookId,String bookName, String Publisher,String author){
        this.BookId=BookId;
        this.bookName=bookName;
        this.publisher=Publisher;
        this.author=author;

    }
    public String getBookName(){
        return bookName;
    }

    public int getBookId(){
        return BookId;
    }
    public void reserve(boolean value){
        IsReserved=value;
    }
    public boolean ShowReservationStatus(){
        return IsReserved;
    }
    public boolean IsBookAvailable(int bookId){
        boolean found=false;
        if((BookId==bookId)&&(!ShowReservationStatus())){
                found=true;
           }
        return found;
        }

    }


