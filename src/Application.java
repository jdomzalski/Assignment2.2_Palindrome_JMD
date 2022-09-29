/**
 * @author Joshua Domzalski
 * Palindrome Assignment
 * Fall 2022
 * This program takes a word that a user inputs and checks to see if the word is a palindrome or not
 */
import java.util.*;

public class Application {

	public static void main(String[] args) {
		
		/**
		 * Variable declaration
		 */
		Stack<Character> myStack = new Stack<Character>();
		Scanner scan = new Scanner(System.in);
		String word;
		
		/**
		 * Asking the user to input a word and using the Scanner to store that word
		 */
		System.out.println("Enter a word: ");
		word = scan.next();
		
		/**
		 * Adding each character in the word to a Stack
		 */
		for(int i = 0; i< word.length(); i++) {
			myStack.push(word.charAt(i));
		}
	
		/**
		 * Checking to see if the first index if equal to the top of the stack and if it is, popping the stack and repeating the process
		 * with the next index
		 */
		for(int i = 0; i<word.length(); i++) {
			if(word.charAt(i) == myStack.peek()) {
				myStack.pop();
			}
		}
			
		/**
		 * Checking to see if the Stack is empty (if all were matches in the above loop, it will be) and printing to the user the result
		 */
		if(myStack.isEmpty()) {
			System.out.println("This is a palindrome!");
		}
		else
			System.out.println("This is not a palindrome!");
		
			

}//end main
}//end class
