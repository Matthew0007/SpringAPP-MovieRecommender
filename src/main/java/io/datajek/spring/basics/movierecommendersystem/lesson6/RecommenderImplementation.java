package io.datajek.spring.basics.movierecommendersystem.lesson6;
import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    //use filter interface to select filter
    @Autowired
    @Qualifier("CBF")
    private Filter filter;


    public String [] recommendMovies (String movie) {
        System.out.println("\nName of the filter in use: " + filter + "\n");
        String[] results = filter.getRecommendations("Finding Dory");
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

