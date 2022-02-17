package io.datajek.spring.basics.movierecommendersystem.lesson13.lesson6;

import io.datajek.spring.basics.movierecommendersystem.lesson2.Filter;
import org.springframework.stereotype.Component;


@Component
public class CollaborativeFilter implements Filter {


    public String[] getRecommendations(String movie){

        return new String[] { };
    }


}
