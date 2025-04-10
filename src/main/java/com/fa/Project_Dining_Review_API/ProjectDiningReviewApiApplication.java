package com.fa.Project_Dining_Review_API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.fa.Project_Dining_Review_API.repository")
public class ProjectDiningReviewApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectDiningReviewApiApplication.class, args);
	}

}
