package br.com.leomanzini.control_structures;

public class IfElse {

	public static void main(String[] args) {
		
		// Don't stick to the syntax for now, understand the conditional structures!!
		
		// First if with the verification of the test value
		
		boolean test = true;
		
		if (test) {
			System.out.println("Test is true.");
		} else {
			System.out.println("Test is false.");
		}
		
		// Second if with the verification denying the test value
		if (!test) {
			System.out.println("Negate test is true.");
		} else {
			System.out.println("Negate test is false.");
		}
		
		// Verify the final grade of a student
		
		int finalGrade = 7;
		
		if (finalGrade >= 8) {
			System.out.println("Approved student.");
		} else if (finalGrade >= 5) {
			System.out.println("Recovering student.");
		} else {
			System.out.println("Reproved student.");
		}
		
		// Verify if we are at the first or second fortnight of the month
		
		int day = 20;
		
		if (day <= 15) {
			System.out.println("First fortnight.");
		} else {
			System.out.println("Second fortnight.");
		}
		
		// Greeting according to period (24h format)
		
		int hour = 10;
		
		if (hour >= 6) {
			System.out.println("Good morning!");
		} else if (hour >= 12) {
			System.out.println("Good afternoon!");
		} else if (hour >= 18) {
			System.out.println("Good night!");
		} else {
			System.out.println("I don't know the time of day now, so Hi!");
		}
	}

}
