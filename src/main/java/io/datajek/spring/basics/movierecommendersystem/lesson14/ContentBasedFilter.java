package io.datajek.spring.basics.movierecommendersystem.lesson14;

import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;


public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movie){
        //logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};

    }
}
