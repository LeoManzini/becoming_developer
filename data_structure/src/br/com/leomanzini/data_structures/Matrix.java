package br.com.leomanzini.data_structures;

public class Matrix {

	public static void main(String[] args) {
		
		// Creating a matrix
		int matrix1[][] = new int[2][2];
		
		// Creating and initializing
		int matrix2[][] = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		
		// Creating and initializing with a different number of columns to each line
		int matrix3[][] = new int[2][];  // Create two lines
		matrix3[0] = new int[5]; // Create five columns to the first line
		matrix3[1] = new int[3]; // Create tree columns to the second line
		
		// Creating and initializing with different column numbers
		int matrix4[][] = { {1, 2}, {4, 5, 6, 7, 8}, {9, 10, 11} };
		
		// Printing the matrix4
		for (int i = 0; i < matrix4.length; i++) { // matrix4.length is for the lines
			
		   System.out.printf("Line %d: ", (i+1));
		   
		   for (int j = 0; j < matrix4[i].length; j++) { //matrix4[].length is for the columns
			   
			   System.out.print(" " + matrix4[i][j]);
		   }
		   System.out.println();
		}

		// Filling the double vector with random numbers
		for (int i = 0; i < matrix3.length; i++) {
			for (int j = 0; j < matrix3[i].length; j++) {
				matrix3[i][j] = (int)Math.round(Math.random() * 10);
			}
		}
		
		// Printing the matrix3 that have random numbers
		for (int i = 0; i < matrix3.length; i++) { // matrix4.length is for the lines
			
		   System.out.printf("Matrix 3 line %d: ", (i+1));
		   
		   for (int j = 0; j < matrix3[i].length; j++) { //matrix4[].length is for the columns
			   
			   System.out.print(" " + matrix3[i][j]);
		   }
		   System.out.println();
		}
		
		// Using a for each to the matrix with random numbers
		for (int[] lines : matrix3) {
			System.out.println();
			for (int columns : lines) {
				System.out.print("Data: " + columns + " ");
			}
		}
	}
}
