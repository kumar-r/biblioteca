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

    public User(int libId,String userName){
        this.libId=libId;
        this.userName=userName;
    }

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
}
