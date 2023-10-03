package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {
	
//	Generate a random number between 1 - 100 

	public static void main(String[] args) {

		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		int r = random.nextInt(100);

//		System.out.println("Random Number is: " + r);
//		Above is a code to test program 
		System.out.println("Pick a number between 1 and 100");
		
		int playerGuess = 0;
		
		
		while (playerGuess <5) {		

			int g =scanner.nextInt();
					
			if (g == r) {
			System.out.println("YOU WIN!");
			break;
			}
			else if (g < 1 || g > 100) {
			System.out.println("Your guess is not between 1 and 100, please try again");
			continue;
			}
			else if (r > g) {
			System.out.println("Please pick a higher number");
			}
			else if(r < g) {
			System.out.println("Please pick a lower number");
			} 
			playerGuess++;
			
		}
		
		if (playerGuess == 5) {
			System.out.println("You lose, the number to guess was " + r);
		}
		scanner.close();
	}
	

	}


