package Game;

import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class numGame {

	public static void main(String[] args) throws NoSuchElementException {
		// TODO Auto-generated method stub
		System.out.println("~~~~~~~~WELCOME TO GUESS GAME !!~~~~~~~~ \n Your Name? ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		System.out.println("\nHello " + name);

		System.out.println("\n To start: press 1 \n To Quit: press 2");
		int start = scanner.nextInt();

		while (start != 1 && start != 2) {
			System.out.println("Wrong choice, try again");
			start = scanner.nextInt();
		}

		if (start == 1) {
			System.out.println("\tGreat!! let's begin... \n Guess a number between 0 and 20");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();

			Random rand = new Random();
			int digit = rand.nextInt();

			int tries = 0;
			boolean hasWon = false;
			boolean endGame = false;

			while (!endGame) {
				tries++;
				if (tries < 5) {
					if (num == digit) {
						hasWon = true;
						endGame = true;
					} else {
						System.out.println("Wrong guess, try again:");
						num = scan.nextInt();
					}
				} else if (tries > 5) {
					endGame = true;
					System.out.println("YOU LOST \t The number was " + digit);
					System.out.println("GAME OVER");
				}
				if (hasWon) {
					System.out.println("CONGRATS!! you won on trial " + tries);
				}
			}
		} else if (start == 2) {
			System.out.println("Bye " + name);
		}

	}

}
