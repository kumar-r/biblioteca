package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: HP
 * Date: 17/7/12
 * Time: 7:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class BookCollection{ //a repository layer class with the methods for addition and deletion.

        List<Book> books = new ArrayList<Book>();
    public BookCollection(){
            books.add(new Book(1,"Harry Potter and the Philosophers Stone","J.K. rowling","Bloomsbury"));
            books.add(new Book(2,"Pride and Prejudice","Jane Austen","Whitehall"));
            books.add(new Book(3,"The Immortals of Meluha","Amish","Tara Press"));
            books.add(new Book(4,"A Thousand Splendid Suns","Khaleid Hosseini","Bloomsbury"));
            books.add(new Book(5,"Troublesome Words","Bill Bryson","Penguin"));
            books.add(new Book(6,"Gone with the wind","Margaret Mitchell","KRJ"));
            books.add(new Book(7,"The complete Reference Java","Herbert Schildt","McGraw Hill"));
            books.add(new Book(8,"Database systems","Elmasri Navathe","Pearson"));
            books.add(new Book(9,"A Painted House","John Grisham","Dell"));
            books.add(new Book(10,"Sherlock Holmes","Sir Arthur Conan Doyle","Benton Classics"));
        }

    public boolean AddNewBook(int Id,String bookName,String Author, String publisher)
            throws IndexOutOfBoundsException{
        try{
            books.add(new Book(Id,bookName,Author,publisher));
        }catch (IndexOutOfBoundsException e){
            System.out.println("Collection size full: please add later");
        }
        return  true;
    }

    public boolean RemoveBook(int Id)throws IndexOutOfBoundsException{
        boolean foundBookToRemove=false;
        try{
            for(int i=0;i<books.size();i++)
            {
                if(Id == books.get(i).getBookId()){
                    books.remove(i);
                    foundBookToRemove=true;
                }
            }
           }catch (IndexOutOfBoundsException e){
            System.out.println("Exception arised: could not delete from list");
        }

    return foundBookToRemove;
    }

}