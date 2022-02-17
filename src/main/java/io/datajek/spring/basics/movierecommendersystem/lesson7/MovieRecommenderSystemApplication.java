package io.datajek.spring.basics.movierecommendersystem.lesson7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;


@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {

//		SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		RecommenderImplementation2 recommender2 = appContext.getBean(RecommenderImplementation2.class);

		String[] result = recommender2.recommendMovies("Finding Dory");

		System.out.println(Arrays.toString(result));

	}

}
