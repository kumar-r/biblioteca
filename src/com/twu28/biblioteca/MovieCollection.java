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
     /* movies.add(new Movie(4,"A Thousand Splendid Suns","Khaleid Hosseini","Bloomsbury"));
        movies.add(new Movie(5,"Troublesome Words","Bill Bryson","Penguin"));
        movies.add(new Movie(6,"Gone with the wind","Margaret Mitchell","KRJ"));
        movies.add(new Movie(7,"The complete Reference Java","Herbert Schildt","McGraw Hill"));
        movies.add(new Movie(8,"Database systems","Elmasri Navathe","Pearson"));
        movies.add(new Movie(9,"A Painted House","John Grisham","Dell"));
        movies.add(new Movie(10,"Sherlock Holmes","Sir Arthur Conan Doyle","Benton Classics"));
       */
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
