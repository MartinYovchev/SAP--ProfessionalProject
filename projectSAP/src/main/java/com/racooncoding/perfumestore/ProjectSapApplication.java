package com.racooncoding.perfumestore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class ProjectSapApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProjectSapApplication.class, args);
	}
}
