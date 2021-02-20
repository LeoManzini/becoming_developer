package br.com.leomanzini.control_structures;

public class Switch {

	public static void main(String[] args) {
		
		// Don't stick to the syntax for now, understand the conditional structures!!
		
		// Verifying a final grade of a student
		int finalGrade = 10;
		
		switch (finalGrade) {
			case 0 :
			case 1 :
			case 2 :
			case 3 :
			case 4 :
				System.out.println("Reproved student.");
				break;
			case 5 :
			case 6 :
			case 7 :
				System.out.println("Recovering student.");
				break;
			case 8 :
			case 9 :
			case 10 :
				System.out.println("Approved student.");
			default :
				System.out.println("Waiting for final grade.");
		}
		
		// Verifying the number you chose
		int number = 10;
		
		switch (number) {
			case 0 :
				System.out.println("You chose 0.");
				break;
			case 1 :
				System.out.println("You chose 1.");
				break;
			case 2 :
				System.out.println("You chose 2.");
				break;
			case 3 :
				System.out.println("You chose 3.");
				break;
			case 4 :
				System.out.println("You chose 4.");
				break;
			case 5 :
				System.out.println("You chose 5.");
				break;
			case 6 :
				System.out.println("You chose 6.");
				break;
			case 7 :
				System.out.println("You chose 7.");
				break;
			case 8 :
				System.out.println("You chose 8.");
				break;
			case 9 :
				System.out.println("You chose 9.");
				break;
			case 10 :
				System.out.println("You chose 10.");
			default :
				System.out.println("You chose a number higher than 10 or lower than 0.");
		}
		
		// Verifying the fruit you chose 
		String fruit = "banana";
		
		switch (fruit) {
			case "apple" :
				System.out.println("You chose Apple.");
				break;
			case "watermelon" :
				System.out.println("You chose watermelon.");
				break;
			case "grape" :
				System.out.println("You chose grape.");
				break;
			case "banana" :
				System.out.println("You chose banana.");
				break;
			case "pear" :
				System.out.println("You chose pear.");
				break;
			case "strawberry" :
				System.out.println("You chose strawberry.");
				break;
			default :
				System.out.println("Wich fruit is this?");
		}
	}

}
