package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: HP
 * Date: 19/7/12
 * Time: 11:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class Movie {
    private String movieName;
    private String director;
    private int rating;


    public Movie(String moviName, String director,int rating){
        this.movieName=moviName;
        this.director=director;
        this.rating=rating;

    }
    public String getMovieName(){
        return movieName;
    }
    public String getDirector(){
        return director;
    }
    public int getRating(){
        return rating;
    }
}
