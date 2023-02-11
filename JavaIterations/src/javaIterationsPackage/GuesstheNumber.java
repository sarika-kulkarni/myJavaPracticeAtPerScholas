package javaIterationsPackage;

import java.util.Scanner;

public class GuesstheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	       // Generate a random number to be guessed
	       int number = (int) (Math.random() * 101);
	       Scanner input = new Scanner(System.in);
	       System.out.println("Guess a magic number between 0 and 100");
	       int guess = -1;
	       while (guess != number) {
	           // Prompt the user to guess the number
	           System.out.print("\nEnter your guess: ");
	           guess = input.nextInt();
	           if (guess == number)
	               System.out.println("Yes, the number is " + number);
	           else if (guess > number)
	               System.out.println("Your guess is too high");
	           else
	               System.out.println("Your guess is too low");
	       } // End of loop
	}

}
