
/**
 * Unit 2 Project
 * 
 * In this project you have the opportunity to demonstrate your knowledge of for loops
 * and nested for loops. Using the already created file named `SpaceNeedle.java` write a 
 * program that outputs an ASCII art version of the Space Needle. The goal of this 
 * project is to use ONLY what we have learned in Unit 2 (and prior) to create the Space 
 * Needle. Your code must be broken up into methods as appropriate and have comments 
 * describing what each method does.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this (and previous) unit. 
 */

package spaceNeedle;

public class SpaceNeedle {
	/**
	 * DO NOT MODIFY THE NAME/TYPE OF THIS CLASS CONSTANT.
	 * 
	 * You may modify the value to test your output on different sizes.
	 */
	private static int SIZE = 4;
	
	public static void main(String[] args) {
		smallLines();
		widening();
		connector();
		narrowing();
		smallLines();
		longLines();
		widening();
		connector();
	}
	
	public static void smallLines() {
		//Prints thin, small lines
		for (int count = 1; count <= SIZE; count++) {
			for (int c = 1; c <= SIZE; c++) {
				System.out.print("   ");
			}
			System.out.println("||");
		}
	}
	
	public static void widening() {
		//Prints the piece wider at the bottom
		for (int line = 1; line <= SIZE; line++) {
			for (int count = 1; count <= SIZE-line; count++) {
				System.out.print("   ");
			}
			System.out.print("__/");
			for (int count = 1; count < line; count++) {
				System.out.print(":::");
			}
			System.out.print("||");
			for (int count = 1; count < line; count++) {
				System.out.print(":::");
			}
			System.out.println("\\__");
		}
	}
	
	public static void connector() {
		//Prints the single, wide line
		System.out.print("|");
		for (int count = 1; count <= SIZE*6; count++) {
			System.out.print("\"");
		}
		System.out.println("|");
	}
	
	public static void narrowing() {
		//Prince the piece narrower at the bottom
		for (int line = SIZE; line >= 1; line--) {
			for(int count = 1; count <= SIZE-line; count++) {
				System.out.print("  ");
			}
			System.out.print("\\_");
			for (int count = 1; count <= 2*line+SIZE-1; count++) {
				System.out.print("/\\");
			}
			System.out.println("_/");
		}
	}
	
	public static void longLines() {
		//prints the wide, long lines
		for (int line=1; line<=SIZE*SIZE; line++) {
			for (int count = 1; count <= SIZE*2+1; count++) {
				System.out.print(" ");
			}
			System.out.print("|");
			for (int count = 1; count <= SIZE-2; count++) {
				System.out.print("%");
			}
			System.out.print("||");
			for (int count = 1; count <= SIZE-2; count++) {
				System.out.print("%");
			}
			System.out.println("|");
		}
	}
}