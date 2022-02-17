package io.datajek.spring.basics.movierecommendersystem.lesson3;

import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;
import org.springframework.stereotype.Component;


public class CollaborativeFilter implements Filter {


    public String[] getRecommendations(String movie){

        return new String[] { };
    }


}
