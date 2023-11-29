package com.ug.zad.springlab04zad01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springlab04zad01Application {

	public static void main(String[] args) {
		SpringApplication.run(Springlab04zad01Application.class, args);

		MathApplication mathApplication = new MathApplication(new Calculator());

		int sum = mathApplication.add(5, 3);
		System.out.println("Wynik dodawania: " + sum);

		int difference = mathApplication.subtract(8, 4);
		System.out.println("Wynik odejmowania: " + difference);
	}
}
