package br.com.leomanzini.control_structures;

public class LoopControl {
	
	public static void main(String args[]) {
		
		// Don't stick to the code syntax for now, understand the loop control syntax!!
		
		int counter = 0;
		
		// Using break and continue at the For loop
		for(counter = 1; counter <= 10; counter++) {
			if (counter == 5) {
				System.out.println("When the counter is 5, pass here and go back to the conditional test, whithout print the value 5.");
				continue;
			}
			
			System.out.println("For value: " + counter);
			
			if (counter == 7) {
				System.out.println("If the counter is 7 the code exit this loop.");
				counter = 1;
				break;
			}
		}
		
		// Using break and continue at the While loop
		while(counter <= 10) {
			
			counter++; // At the wile we increment the counter inside the loop
			
			if(counter == 2) { // Need this verification because the counter need to be increased at the while
				System.out.println("While Value: " + (counter - 1)); 
			}
			
			if (counter == 5) {
				System.out.println("When the counter is 5, pass here and go back to the conditional test, whithout print the value 5.");
				continue;
			}
			
			System.out.println("While value: " + counter);
			
			if (counter == 5) {
				System.out.println("If the counter is 5 the code exit this loop, if reach this point.");
				break;
			}
		}
		
		counter = 1;
		
		// Using break and continue at a Do While loop
		do {
			
			counter++; // At the do while we increment the counter inside the loop
			
			if(counter == 2) { // Need this verification because the counter need to be increased at the do while
				System.out.println("Do While Value: " + (counter - 1)); 
			}
			
			if (counter == 5) {
				System.out.println("When the counter is 5, pass here and go back to the conditional test, whithout print the value 5.");
				continue;
			}
			
			System.out.println("Do While value: " + counter);
			
			if (counter == 3) {
				System.out.println("If the counter is 3 the code exit this loop.");
				counter = 1;
				break;
			}
		} while(counter <= 10);
	}
}
