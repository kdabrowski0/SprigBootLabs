package com.ug.zad.springlab04zad02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Springlab04zad02Application {

	public static void main(String[] args) {
		SpringApplication.run(Springlab04zad02Application.class, args);
	}

	@Component
	public static class SortTester implements CommandLineRunner {

		private final SortManager sortManager;

		@Autowired
		public SortTester(SortManager sortManager) {
			this.sortManager = sortManager;
		}

		@Override
		public void run(String... args) throws Exception {
			int[] arrayToSort = {5, 2, 8, 1, 6, 3, 7, 4};

			int[] sortedArray = sortManager.performSort(arrayToSort);

			System.out.print("Posortowana tablica: ");
			for (int num : sortedArray) {
				System.out.print(num + " ");
			}
		}
	}
}