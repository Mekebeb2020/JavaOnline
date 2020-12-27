package com.fundamentals.exercises;

import com.fundamentals.DaysOfTheWeek;
import com.fundamentals.lessons.Lesson16;
import com.fundamentals.lessons.Lesson16Lab;

public class Lesson16Exercises {


    public enum MovieGenres{ACTION, COMEDY, DRAMA, HORROR, ROMANCE}

    public  void showEnum(){
        System.out.println(MovieGenres.ROMANCE);

    }

       public void MyBestMovie(MovieGenres genres){

        String movie = " The best movie is ";
        switch (genres){
            case ACTION:
                movie += "Fast & Furious";
                break;
            case COMEDY:
                movie +=  "American Pie 2";
                break;
            case DRAMA:
                movie += "The Irishman";
                break;
            case HORROR:
                movie += " The Walking Dead";
                break;
            case ROMANCE:
                movie += "The Note book ";
                break;
        }
        System.out.println(movie);

    }

}