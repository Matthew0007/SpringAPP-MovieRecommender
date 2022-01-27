package io.datajek.spring.basics.movierecommendersystem.lesson1;
import java.util.*;

public class RecommenderImplementation {

    public String[] recommendMovies(String movie){
        //use content based filter to find similar movies
        //return the results
        ContentBasedFilter filter = new ContentBasedFilter();
        String[] results = filter.getRecommendations("Finding Dory");
        return results;
    }

















//    public ArrayList<String> recommendMovies(String movie){
//
//        //use content based filter to find similar movies
//        //return the results
//
//        return new String[] {"M1", "M2", "M3"};
//    }
}
