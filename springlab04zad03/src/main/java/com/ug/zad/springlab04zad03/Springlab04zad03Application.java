package com.ug.zad.springlab04zad03;

import com.ug.zad.springlab04zad03.service.PersonService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springlab04zad03Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Springlab04zad03Application.class, args);
		PersonService personService = context.getBean(PersonService.class);
		personService.printAllBeans();
	}
}