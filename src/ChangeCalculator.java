// Copyright The League of Amazing Programmers 2014

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. 
 * Then make me a sandwich.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// 1. Ask the user how many nickels they have
			String answer = JOptionPane.showInputDialog( "How many nickels do you have?");
		// 2. Convert their answer to an int using Integer.parseInt()
			int nickels = Integer.parseInt(answer);
			
		// 3. Ask the user how many dimes they have, and convert their answer
			 answer = JOptionPane.showInputDialog( "How many dimes do you have?");
			int dimes = Integer.parseInt(answer);
		// 4. Ask the user how many quarters they have, and convert their answer
			answer = JOptionPane.showInputDialog("How many quareters do you have?");
			int quarters = Integer.parseInt(answer);
		// 5. Calculate how much money the user has and save it in a double variable 
			double answertotal = 0.05 * nickels + 0.1 * dimes + 0.25 * quarters;
		// 6. Tell the user how much money they have
			JOptionPane.showMessageDialog(null, "You have " + answertotal + " dollars!");
	}
}

