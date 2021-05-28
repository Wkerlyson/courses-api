package com.course.module;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableCaching
@EnableScheduling
@Configuration
@PropertySource("classpath:application-${spring.profiles.active}.properties")
public class CoursesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoursesApiApplication.class, args);
	}

}
