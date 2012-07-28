package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: HP
 * Date: 17/7/12
 * Time: 7:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class User{
   private UserLibraryId userLibraryId=new UserLibraryId(); //UserLibraryId contains the username and password for the user-
   int IdofBookReserved;                                    //-implemented in the form of class.
   boolean HasReserved;
   private boolean loggedin;

  public User(int userName, int pasword){
        this.userLibraryId.setUsername(userName);
        this.userLibraryId.setPassword(pasword);
    }
    public User(){}

    public void setLoggedin(boolean value){
        this.loggedin=value;
    }

    public boolean getLoggedin(){
        return this.loggedin;
    }
    public int userUsername(){
        return userLibraryId.getUsername();
    }
    public int userPassword(){
        return userLibraryId.getPassword();
    }
    public String userLibraryId(){
        return userLibraryId.giveLibraryId();
    }
    public int SelectMenuOption(InputDevice inputdevice){
        return (inputdevice.readint());
    }


    public boolean ReturnReservedBook(BookCollection bookcollection) {
        if(getHasReserved()){
            IdofBookReserved=0;
            HasReserved(false);
            bookcollection.books.get(IdofBookReserved).reserve(false);  //returning the book reserved to bookcollection
            return true;                                                  //as unreserved book.
        }
        else
            return false;

    }

    public void HasReserved(boolean b) {
        HasReserved=b;
    }

    public boolean getHasReserved() {
        return HasReserved;
    }
}
