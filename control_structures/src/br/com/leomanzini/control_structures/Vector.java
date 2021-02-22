package br.com.leomanzini.control_structures;

public class Vector {

	public static void main(String[] args) {

		// int vector[]; // Declaring a vector
		// vector = new int [10]; // Allocating memory for the vector

		int integerVector[] = new int[10]; // Declaring and allocating memory in one line for an integer vector

		double doubleVector[] = new double[10]; // For an double vector

		// Starting vectors with standard values
		int tenNumbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		String names[] = { "Juca Bala", "Maria Chiquinha", "Falcão Melhor Cantor" };

		// Creating the elements in a for loop
		for (int counter = 0; counter < integerVector.length; counter++) {
			integerVector[counter] = counter;
		}

		// Verifying the higher and lower value in a vector
		int sum = 0;
		int lower = integerVector[0];
		int higher = integerVector[0];

		for (int i = 0; i < integerVector.length; i++) {
			sum = sum + integerVector[i];

			if (integerVector[i] < lower) {
				lower = integerVector[i];
			}

			if (integerVector[i] > higher) {
				higher = integerVector[i];
			}
		}
		System.out.println("The integer vector sum: " + sum);
		System.out.println("Higher value inside the vector: " + higher);
		System.out.println("Lower value inside the vector: " + lower);
		
		// Filling the double vector with random numbers
		for (int i = 0; i < doubleVector.length; i++) {
			doubleVector[i] = Math.round(Math.random() * 10);
		}
		
		// For loop to cycle through the vectors
		for (int numbers : tenNumbers) {
			System.out.println("Number at this vector position: " + numbers);
		}
		
		for (String name : names) {
			System.out.println("Name at this vector position: " + name);
		}
	}
}
