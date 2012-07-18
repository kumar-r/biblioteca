package com.twu28.biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: HP
 * Date: 17/7/12
 * Time: 8:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserDatabase{
   ArrayList<User> users = new ArrayList<User>();
        UserDatabase(){
            users.add(new User(1000,"Aston martin"));
            users.add(new User(1001,"Scarlett johannson"));
            users.add(new User(1002,"Tom Riddle"));
            users.add(new User(1003,"Bruce Lee"));
            users.add(new User(1004,"Marlyn Moonroe"));

        }
    }

