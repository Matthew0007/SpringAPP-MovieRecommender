package io.datajek.spring.basics.movierecommendersystem.lesson2;

import io.datajek.spring.basics.movierecommendersystem.lesson1.RecommenderImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {

		SpringApplication.run(MovieRecommenderSystemApplication.class, args);


		io.datajek.spring.basics.movierecommendersystem.lesson2.RecommenderImplementation recommender = new io.datajek.spring.basics.movierecommendersystem.lesson2.RecommenderImplementation(new CollaborativeFilter());


		String[] result = recommender.recommendMovies("Finding Dory");
		System.out.println(result);
		System.out.println(Arrays.toString(result));




	}

}
