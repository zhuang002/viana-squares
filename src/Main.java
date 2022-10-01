import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Method 1:
		 * 		Step 0. read input.
		 * 		Step 1. Using Math.sqrt() to get the square root of the number and round it to integer.
		 * 		Step 2. print the output.
		 * 
		 * Method 2: if you do not know Math.sqrt()
		 * 		Step 0. read input.
		 * 		Step 1. Try the edge length from 1 and increase it until it reaches the input.
		 * 		Step 2. print the output.
		 */
		
		
		// Step 1.
		Scanner sc = new Scanner(System.in);
		int units = sc.nextInt();
		
		// step1. method 1.
		/*double sqrt = Math.sqrt(units);
		int edgeLength = (int)sqrt;*/
		int edgeLength = (int)Math.sqrt(units);
		
		// step 1. method 2.
		int length = 1;
		int square = length*length;
		while (square < units) {
			length++;
			square = length*length;
		}
		if (square > units)
			length--;
		
		
		
		// Step 2.
		System.out.println(edgeLength);
	}

}
