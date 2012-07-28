package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: HP
 * Date: 25/7/12
 * Time: 11:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class Library {
    private OutputDevice outputdevice=new OutputDevice();
    private InputDevice inputdevice=new InputDevice();
    private ListAvaliableBooks listbook=new ListAvaliableBooks();
    private ListAvaliableMovies listmovie=new ListAvaliableMovies();

    public boolean reserveABookbyBookid(int bookId,BookCollection bookcollection,User user)throws IndexOutOfBoundsException{
         int index=0;//=bookId-1;
         boolean bookAvaliability=false;
        try{
         for(int i=0;i<bookcollection.books.size();i++){
         if(bookcollection.books.get(i).IsBookAvailable(bookId)){
             bookAvaliability=true;
             index=i;
         }
        }
        }catch(IndexOutOfBoundsException e){System.out.println("Enter correct book-id.Array index out of bounds");}
        if(bookAvaliability){
            bookcollection.books.get(index).reserve(true);
            user.HasReserved(true);
            outputdevice.output("The Book has been reserved for you.Thankyou :) enjoy the book!!!");
         }
        else
           outputdevice.output("Sorry we don't have the book yet, try later :(");
         return bookAvaliability;
    }

    public int UserLogin(UserDatabase UDB,int username,int password){
        int index=-1;
        for(int i=0;i<UDB.users.size();i++){
            if((username==UDB.users.get(i).userUsername())&&(password==UDB.users.get(i).userPassword())){
                index=i;
                UDB.users.get(i).setLoggedin(true);
                outputdevice.output("index of user is\t"+index);
                break;
            }
        }

        return index;
    }

    public int DisplaymainMenu(){
            UsermenuOption UMO=new UsermenuOption();
            UMO.displayMenuOptions(outputdevice);
            return 99;
    }

    public boolean ShowBooksInLibrary(BookCollection bookcollection){
        listbook.DisplayListOfAvaliableBooks(outputdevice,bookcollection);
        return true;
    }

    public boolean ShowMoviesInLibrary(MovieCollection moviecollection){
        listmovie.DisplayListOfMovies(outputdevice,moviecollection );
        return true;
    }

    public boolean ShowWelcomeScreen() {
        Welcome splash = new Welcome(2000);
        System.out.println("WelCome To Biblioteca");
        try{
            splash.showSplashAndExit();
        }
        catch (RuntimeException ie){
            System.out.println("Some error in Running Graphical interface"+ ie);
        }
        return true;
    }
}

