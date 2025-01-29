package studio2;

import java.util.Scanner;

public class GamblersRuin {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("What is the starting amount?: ");
		int startAmount = in.nextInt();
		System.out.println("What is the win chance?: ");
		double winChance = in.nextDouble();
		System.out.println("Total Simulations (Days)");
		int totalSimulations = in.nextInt();
		int numberOfPlays = 0;
		
		for (int i = 0; i < totalSimulations; i++) {
			int currentAmount = startAmount;
			while (currentAmount > 0 && currentAmount < totalSimulations) {
				numberOfPlays++;
				double randomNumber = Math.random();
				if (randomNumber <= winChance) {	
					//System.out.println("You win!");
					currentAmount++;
				} else {
					//System.out.println("You lose :(");
					currentAmount--;
					
					}
				
			}
			
			System.out.println("Day " + (i + 1) + " is over.");
			System.out.println("Number of Plays " + numberOfPlays);	
			if (currentAmount == 0) {
				System.out.println("Ended in ruin");
				
			} else {
				System.out.println("Ended in success");
			}

		}
	}
	}
 