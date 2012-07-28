package com.twu28.biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: HP
 * Date: 24/7/12
 * Time: 2:59 PM
 * To change this template use File | Settings | File Templates.
 */
public class ListAvaliableMovies {              //UI layer class responsible for displaying available movies.
    ListAvaliableMovies(){}

    public void DisplayListOfMovies(OutputDevice OD,MovieCollection moviecollection) {
        String output="list of all movies:\n";
        for (int i = 0; i < moviecollection.movies.size(); i++) {
            String movie = moviecollection.movies.get(i).getMovieName();
            String director=moviecollection.movies.get(i).getDirector();
            int rating=moviecollection.movies.get(i).getRating();
            output += (i + 1) + "." + movie +"\t"+ director+"\t"+rating+"\n";
        }
        output += "\n";
        OD.output(output);

    }
}
