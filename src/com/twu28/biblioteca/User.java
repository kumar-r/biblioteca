package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: HP
 * Date: 17/7/12
 * Time: 7:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class User{
   private int libId;
   private String userName;
   InputDevice inputdevice=new InputDevice();
   int IdofBookReserved;
   boolean HasReserved;

  private boolean loggedin;

  public User(int libId,String userName){
        this.libId=libId;
        this.userName=userName;
    }
    public User(){}

    public void setLibId(int userId){
        this.libId=userId;
    }
    public int getlibId(){
        return this.libId;
    }
    public void setUserName(String username){
        this.userName=username;
    }
    public String getUsername(){
        return this.userName;
    }
    public void setLoggedin(boolean value){
        this.loggedin=value;
    }
    public boolean getLoggedin(){
        return this.loggedin;
    }
    public int SelectMenuOption(){
        return (inputdevice.readint());

    }

    public boolean CheckLibNumber(int libnum){
        UserDatabase UDB=new UserDatabase();
        boolean IdAvailable=false;
        for(int i=0;i<UDB.users.size();i++){
            if(UDB.users.get(i).libId==libnum)
                IdAvailable=true;

        } return IdAvailable;
    }


    public void SetEnteredBookAsBookReserved(int bookId,BookCollection bookC) {
        int index=bookId-1;
        this.IdofBookReserved=(index);

        bookC.books.get(index).setIsReserved(true);
       HasReserved=true;
   }

    public boolean ReturnReservedBook() {
        if(HasReserved){
            IdofBookReserved=0;
            HasReserved=false;
            return true;
        }
        else
            return false;

    }
}
