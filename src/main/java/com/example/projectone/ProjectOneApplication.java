//Name: Michael Felix
//Date: October 31, 2018
//EGR327-A - Software Construction
//Email: Michael.Felix@calbaptist.edu
//Project 1

package com.example.projectone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ProjectOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectOneApplication.class, args);
	}
}
