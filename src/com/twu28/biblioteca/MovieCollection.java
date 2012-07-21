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

    public void DisplayListOfMovies(OutputDevice OD) {
        String output="list of all movies:\n";
        for (int i = 0; i < movies.size(); i++) {
            String movie = movies.get(i).movieName;
            String director=movies.get(i).director;
            int rating=movies.get(i).rating;
            output += (i + 1) + "." + movie +"\t"+ director+"\t"+rating+"\n";
        }
        output += "\n";
        OD.output(output);

    }
}
