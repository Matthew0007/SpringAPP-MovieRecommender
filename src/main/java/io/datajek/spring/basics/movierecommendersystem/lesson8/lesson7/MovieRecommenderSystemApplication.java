package io.datajek.spring.basics.movierecommendersystem.lesson8.lesson7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;


@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {

//		SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		CollaborativeFilter cbf1 = appContext.getBean(CollaborativeFilter.class);
		CollaborativeFilter cbf2 = appContext.getBean(CollaborativeFilter.class);
		CollaborativeFilter cbf3 = appContext.getBean(CollaborativeFilter.class);

		System.out.println(cbf1);
		System.out.println(cbf2);
		System.out.println(cbf3);

	}

}
