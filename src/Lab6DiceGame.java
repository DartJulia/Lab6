import java.util.Random;
import java.util.Scanner;

public class Lab6DiceGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Grand Circus Casino!");
		// prompt user for how many sides of die
		System.out.println("How many sides should each die have?");
		int sideNum = scan.nextInt();

		// do you want to roll the dice?
		System.out.println("Do you want to roll the dice?");
		scan.nextLine();
		String choice = "yes";
		choice = scan.nextLine();
		// while loop to continue if wanted
		int i = 0;
		while (choice.equalsIgnoreCase("yes")) {
			++i;
			System.out.println("Roll " + i + ":");
			// assigned variables to rollTheDice method to use in next method
			int sideNum1 = rollTheDice(sideNum);
			int sideNum2 = rollTheDice(sideNum);
			System.out.println(sideNum1);
			System.out.println(sideNum2);
			// use rollTheDice var's to check with uniqueDiceRoll method
			System.out.println(uniqueDiceRoll(sideNum1, sideNum2));
			System.out.println();
			// prompt to roll again
			System.out.println("Roll again? (yes/no)");
			choice = scan.nextLine();


		}
		// end program
		System.out.println("Thanks for playing!");
		scan.close();
	}

	// method to generate random numbers based on number of sides.
	public static int rollTheDice(int numSides) {
		Random rand = new Random();
		return rand.nextInt(numSides) + 1; // +1 means it starts at 1 as the random number
	}

	// method to determine unique dice rolls like snake eyes, craps, boxcars.
	public static String uniqueDiceRoll(int num1, int num2) {
		if (num1 == 6 && num2 == 6) {
			return "You got Boxcars!";
		}
		else if (num1 == 1 && num2 == 1) {
			return "You got snake eyes!";
		} else if (num1 + num2 == 7 || num1 + num2 == 11) {
			return "You got craps!";
		} else {
			return "";
		}
	}

}
