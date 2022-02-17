package io.datajek.spring.basics.movierecommendersystem.lesson3;

import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;
import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movie){
        //logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};

    }
}
