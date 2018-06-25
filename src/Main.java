/* This program tells the user their numerology aspects based on the inputed
 * birthday. 
 * Created by Tamara Wertheim.*/

import java.util.Scanner;

public class Main {
	private static Scanner input;

	public static void main(String[] args) {
		System.out.println("Find out your numerology aspects through your "
				+ "birthdate!");
		Birthnumber bn = new Birthnumber();
		bn.Birthnumber();
		
	}
}