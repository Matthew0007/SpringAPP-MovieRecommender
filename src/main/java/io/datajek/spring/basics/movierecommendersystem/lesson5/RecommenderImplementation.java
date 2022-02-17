package io.datajek.spring.basics.movierecommendersystem.lesson5;
import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    //use filter interface to select filter
    @Autowired
    private Filter collaborativeFilter;


    public String [] recommendMovies (String movie) {
        System.out.println("\nName of the filter in use: " + collaborativeFilter + "\n");
        String[] results = collaborativeFilter.getRecommendations("Finding Dory");
        return results;
    }
}




















//    public ArrayList<String> recommendMovies(String movie){
//
//        //use content based filter to find similar movies
//        //return the results
//
//        return new String[] {"M1", "M2", "M3"};
//    }

