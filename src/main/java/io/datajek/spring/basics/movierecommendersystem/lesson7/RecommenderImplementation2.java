package io.datajek.spring.basics.movierecommendersystem.lesson7;
import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation2 {
    //use filter interface to select filter
    private Filter filter;


    public String [] recommendMovies (String movie) {
        System.out.println("\nName of the filter in use: " + filter + "\n");
        String[] results = filter.getRecommendations("Finding Dory");
        return results;
    }

    @Autowired
    @Qualifier("contentBasedFilter")
    public void setFilter(Filter filter) {
        this.filter = filter;
    }
}




















//    public ArrayList<String> recommendMovies(String movie){
//
//        //use content based filter to find similar movies
//        //return the results
//
//        return new String[] {"M1", "M2", "M3"};
//    }

