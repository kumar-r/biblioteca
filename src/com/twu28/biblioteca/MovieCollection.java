package com.twu28.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: HP
 * Date: 19/7/12
 * Time: 10:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class MovieCollection {
    List<Movie> movies = new ArrayList<Movie>();
    public MovieCollection(){
        movies.add(new Movie("Million dollar baby","Clint Eastwood",10));
        movies.add(new Movie("How to train your Dragon","Dean DeBlois",8));
        movies.add(new Movie("Sholay","Ramesh sippy",9));
        movies.add(new Movie("The Dark Knight Rises","Cristopher Nolan",10));
        movies.add(new Movie("A beautiful Mind","Ron Howard",8));
    }

    public boolean AddMovieToCollection(String movieName, String Director, int rating)throws IndexOutOfBoundsException{
       try{
        movies.add(new Movie(movieName,Director,rating));
       }catch(IndexOutOfBoundsException e){
           System.out.println("List is Full now: please add later" );
       }
        return true;
    }
    public boolean RemoveMovie(String moviename){
        int index;
        boolean foundMovieToRemove=false;
        for(int i=0;i<movies.size();i++)
        {
            if(moviename == movies.get(i).getMovieName())
                index=i;
            foundMovieToRemove=true;
        }

        if(foundMovieToRemove){
              //books.get(index).                    //delete element from list
              System.out.println("Movie deleted successfully");
        }
        else
        System.out.println("ERROR:");
        return foundMovieToRemove;
    }
}
