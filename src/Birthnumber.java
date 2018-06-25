/* This Class asks the user for input to be stored into the program.
 * Created by Tamara Wertheim.*/

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class Birthnumber {
	public void Birthnumber() {
		Scanner scanner = new Scanner(System.in);
		boolean Loop = true;
		String month = null;
		int day = 0, year = 0;

		Stack<String> Months = new Stack<String>();
		Months.add("january");
		Months.add("feburary");
		Months.add("march");
		Months.add("april");
		Months.add("may");
		Months.add("june");
		Months.add("july");
		Months.add("august");
		Months.add("september");
		Months.add("october");
		Months.add("november");
		Months.add("december");

		/**Accepts user input for month. For loop is used should 
		 the input not be string.**/
		do {
			System.out.println("Enter name of month: ");
			month = scanner.nextLine();
			if (!Months.contains(month.toLowerCase()))
				System.out.println("Month doesn't exist");
			else 
				Loop = false;
		} while (Loop);
		Loop = true;

		/**Accepts user input for day. Tries and catches bad input.**/
		do {
			try {
				System.out.println("Enter day: ");
				day = scanner.nextInt();
				if (day < 0) 
					throw new NumberFormatException("Enter positive number.");
				else if (day > 31)
					throw new NumberFormatException("Enter a valid day.");
				Loop = false;
			} catch (InputMismatchException e) {
				System.out.println("Please enter integer");
				scanner.nextLine();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				scanner.nextLine();
			}
		} while (Loop);
		Loop = true;
		
		/** Accepts user input for year. Tries and catches bad input.**/
		do {
			try {
				System.out.println("Enter year: ");
				year = scanner.nextInt();
				if (year < 1900) {
					throw new NumberFormatException("Enter a year after 1900");
				}
				Loop = false;
			} catch (InputMismatchException e) {
				System.out.println("Please enter integer");
				scanner.nextLine();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				scanner.nextLine();
			}
		} while (Loop);

		/**Passes the variables along to the Calculate class.**/
		Birthday bd = new Birthday(month, day, year);
		bd.DisplayDay();
		System.out.println();
		System.out.println("Your result is:");
		Calculate.calculateNumology(bd);
	}
}
