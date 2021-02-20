package br.com.leomanzini.control_structures;

public class TernaryOperator {

	public static void main(String[] args) {
		
		// Don't stick to the syntax for now, understand the conditional structures!!
		
		// First if with the verification of the test value
		boolean test = true;
		System.out.println((test) ? "Test is true." : "Test is false.");
		
		// Second if with the verification denying the test value
		System.out.println((!test) ? "Negate test is true." : "Negate test is false.");
		
		// Verify the final grade of a student
		int finalGrade = 7;
		System.out.println((finalGrade >= 6) ? "Approved student." : "Recovering student.");
		
		/*
		 * At the Ternary operations we just can use a simple expression, with true and false option, without be more complex
		 * like this else if test.
		 * 
		int finalGrade = 7;
		
		if (finalGrade >= 8) {
			System.out.println("Approved student.");
		} else if (finalGrade >= 5) {
			System.out.println("Recovering student.");
		} else {
			System.out.println("Reproved student.");
		}
		*/
		
		// Verify if we are at the first or second fortnight of the month
		int day = 20;
		System.out.println((day <= 15) ? "First fortnight." : "Second fortnight.");
		
		// Greeting according to period (24h format)
		int hour = 12;
		System.out.println((hour >= 12) ? "Good evening!" : "Good morning!");
	}

}
