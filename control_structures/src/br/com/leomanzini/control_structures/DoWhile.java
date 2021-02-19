package br.com.leomanzini.control_structures;

public class DoWhile {
	
	public static void main(String args[]) {
		
		// Don't stick to the syntax for now, understand the repetition loop!!
		
		int counter = 1;
		 
		// Loop to print ten numbers
		do {
			System.out.println("Current number: " + counter);
			counter++;
		} while(counter < 10);  

		 // Starting with false and executing once a time
		 do {  
			 System.out.println("Doing what While loop can't!");  
		 } while(false);
	}
}
