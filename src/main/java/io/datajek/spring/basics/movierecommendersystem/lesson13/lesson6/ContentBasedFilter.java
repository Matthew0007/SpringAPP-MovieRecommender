package io.datajek.spring.basics.movierecommendersystem.lesson13.lesson6;

import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Qualifier
@Component("CBF")
public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movie){
        //logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};

    }
}
