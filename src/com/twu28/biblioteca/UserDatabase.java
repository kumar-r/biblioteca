package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: HP
 * Date: 17/7/12
 * Time: 8:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserDatabase{                 //repository layer class. According to requirement updation, deletion etc
   ArrayList<User> users = new ArrayList<User>();      //have not been implemented.
        UserDatabase(){
            users.add(new User(1000,1110));
            users.add(new User(1001,1111));
            users.add(new User(1002,1112));
            users.add(new User(1003,1113));
            users.add(new User(1004,1114));

        }
    }

