package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: HP
 * Date: 27/7/12
 * Time: 12:14 AM
 * To change this template use File | Settings | File Templates.
 */
public class UserLibraryId {
        private String LibraryId;
        private int password;
        private int username;
        UserLibraryId(){}
        public void setUsername(int username){                //to encapsulate username and password setter and getter methods.
            this.username=username;
        }
        public void setPassword(int password){
            this.password=password;
        }
        public int getUsername(){
            return username;
        }
        public int getPassword(){
            return password;
        }
        public String giveLibraryId(){                       //this mehtod will give the libraryId of a user
            return String.valueOf(username).concat("-").concat(String.valueOf(password));    // in the String format given username and password in integer.

        }
    }


