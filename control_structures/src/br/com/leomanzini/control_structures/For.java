package br.com.leomanzini.control_structures;

public class For {
	
	public static void main(String args[]) {
		
		// Don't stick to the syntax for now, understand the repetition loop!!
		
		int counter = 0;
		
		  // counter   ; stop condition ; increment  standard For.
		for(counter = 1; counter < 10; counter++) {
			System.out.println("Current number:" + counter);
		}
		
		// Nested loops
		for(int variable = 0; variable < 10; variable++) {
			for(int variable2 = 0; variable2 <= variable; variable2++) {
				System.out.println("Internal loop variable value: " + variable2);
				System.out.println("External loop variable value: " + variable);
			}
		}
		
		// Multiplication table, two variables.
		for(int multiplier = 1, table_number = 9; multiplier <= 10; multiplier++) {
			System.out.println(table_number + " x " + multiplier + " = " + (table_number * multiplier));
		}
		
		// Infinite nested labeled loops.
		external : for( ; ; ) {
			for( ; ; ) {
				System.out.println("Passed here.");
				break external;
			}
			// System.out.println("Passed here"); error, cause the break exit the external loop
		}
		
		// Two variables and two tests.
		for(int a = 0, b = 1; (a <= 4) && (b <= 5); a++, b++) {
			System.out.println("A: " + a);
			System.out.println("B: " + b);
		}
		
		// For working as a While loop
		counter = 0;
		for( ; counter <= 10; ) {
			System.out.println("Counter before increasing: " + counter);
			counter++;
			System.out.println("Counter after increasing: " + counter);
		}
		System.out.println("Exited from loop with: " + counter);
	}
}









