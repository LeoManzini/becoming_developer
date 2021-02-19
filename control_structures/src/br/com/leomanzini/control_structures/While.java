package br.com.leomanzini.control_structures;

public class While {
	
	public static void main(String args[]) {
		
		// Don't stick to the syntax for now, understand the repetition loop!!
		
		 int counter = 1;
		 
		 // Loop to print ten numbers
		 while(counter < 10) {
			 System.out.println("Current number: " + counter);
			 counter++;
		 }

		 // Infinitive loop, press ctrl + c to stop it
		 while(true){  
			 System.out.println("infinitive while loop");  
		 }  
	}
}
