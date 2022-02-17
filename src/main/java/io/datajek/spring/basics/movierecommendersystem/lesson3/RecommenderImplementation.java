package io.datajek.spring.basics.movierecommendersystem.lesson3;
import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {
    //use filter interface to select filter
    @Autowired
    private Filter filter;

    public RecommenderImplementation(Filter filter){
        super();
        this.filter = filter;
    }

    //use a filter to find recommendations
    public String[]  recommendMovies (String movie){
        System.out.println("The name of the filer in use: " +filter.toString() +"\n");

        String[] results = this.filter.getRecommendations("Finding Dory");
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
