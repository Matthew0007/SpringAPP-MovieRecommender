package io.datajek.spring.basics.movierecommendersystem.lesson1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {

		SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		RecommenderImplementation recommender = new RecommenderImplementation();

		String[] result  = recommender.recommendMovies("Finding Dory");
		System.out.println(result);
		System.out.println(Arrays.hashCode(result));



	}

}
