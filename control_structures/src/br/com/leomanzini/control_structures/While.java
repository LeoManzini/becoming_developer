package br.com.leomanzini.control_structures;

public class While {
	
	public static void main(String args[]) {
		
		// Don't stick to the syntax for now, understand the repetition loop!!
		
		 int condition = 1;
		 
		 // Loop to print ten numbers
		 while(condition <= 10) {
			 System.out.println("Current number: " + condition);
			 condition++;
		 }

		 // Infinitive loop, press ctrl + c to stop it
		 while(true){  
			 System.out.println("infinitive while loop");  
		 }  
	}
}
