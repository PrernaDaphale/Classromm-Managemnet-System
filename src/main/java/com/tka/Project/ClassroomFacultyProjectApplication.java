package com.tka.Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com")
@ComponentScan("com")
public class ClassroomFacultyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassroomFacultyProjectApplication.class, args);
	}

}
