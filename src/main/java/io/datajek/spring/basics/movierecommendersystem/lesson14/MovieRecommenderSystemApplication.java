package io.datajek.spring.basics.movierecommendersystem.lesson14;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

@Configuration
@ComponentScan
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {

//		SpringApplication.run(MovieRecommenderSystemApplication.class, args);
//		ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext(("appContext.xml"));
		RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

		//check the beans which have been loaded
		System.out.println("\nBeans loaded:");
		System.out.println(Arrays.toString(appContext.getBeanDefinitionNames()));

	}

}
