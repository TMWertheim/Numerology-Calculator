/* Calculate borrows from the Birthday class using Inheritance.
 * Created by Tamara Wertheim.*/

public class Calculate {

	public static void calculateNumology(Birthday bd) {

		int numeralMonth = 0;
		int sum = 0, sum2 = 0, sum3 = 0, sum4 = 0;
		int year = bd.getYear();
		String month = bd.getMonth();
		int day = bd.getDay();
		
		/** Switches the name of the month with its associated number **/
		switch (month.toLowerCase()) {
		case "january":
			numeralMonth = 1;
			break;
		case "februrary":
			numeralMonth = 2;
			break;
		case "march":
			numeralMonth = 3;
			break;
		case "april":
			numeralMonth = 4;
			break;
		case "may":
			numeralMonth = 5;
			break;
		case "june":
			numeralMonth = 6;
			break;
		case "july":
			numeralMonth = 7;
			break;
		case "august":
			numeralMonth = 8;
			break;
		case "september":
			numeralMonth = 9;
			break;
		case "october":
			numeralMonth = 10;
			break;
		case "november":
			numeralMonth = 11;
			break;
		case "december":
			numeralMonth = 12;
			break;
		}
		
		/**Adds the digits of the year together.**/
		while (year > 0) {
			sum += year % 10;
			year /= 10;
		}
		/**Adds the digits of the day together.**/
		while (day > 0) {
			sum2 += day % 10;
			day /= 10;
		}
		
		/** Adds the digits of the month together. **/
		while (numeralMonth > 0) {
			sum3 += numeralMonth % 10;
			numeralMonth /= 10;
		}

		/** Adds the previous digits. **/
		int fullSum = sum + sum2 + sum3;

		/** Adds the new digits of the new number. **/
		while (fullSum > 0) {
			sum4 += fullSum % 10;
			fullSum /= 10;
		}

		/** Arrays of the results are as followed: **/
		String[][] type = {
				{ "Achiever", "born leader, ambitous, do-it-yourself" },
				{ "Idealist", "loving, peacemaker, optimist" },
				{ "Artist", "creative, imaginative, joyful" },
				{ "Pragmatist", "organized, hardworking, practical minded" },
				{ "Opportunist",
						"likes to socialized, big spender, " + "chance taker" },
				{ "Caregiver", "dependable, compassionate, nurterer" },
				{ "Seeker", "spiritual, questioning, eccentric" },
				{ "Affluent", "wealthy, accomplished, educated" },
				{ "Philosopher", "analytical, inspirational, intuitive" },
				{
						"Visionary",
						"enlightened, " + "thinks outside of the box, "
								+ "futuristic minded" },
				{
						"Global Thinker",
						"goal oriented, business minded, "
								+ "international interests" } };
		
		/** Results are as followed: **/
		switch (sum4) {
		case 1:
			System.out.println("Type: " + type[0][0]);
			System.out.println("Attributes: " + type[0][1]);
			break;
		case 2:
			System.out.println("Type: " + type[1][0]);
			System.out.println("Attributes: " + type[1][1]);
			break;
		case 3:
			System.out.println("Type: " + type[2][0]);
			System.out.println("Attributes: " + type[2][1]);
			break;
		case 4:
			System.out.println("Type: " + type[3][0]);
			System.out.println("Attributes: " + type[3][1]);
			break;
		case 5:
			System.out.println("Type: " + type[4][0]);
			System.out.println("Attributes: " + type[4][1]);
			break;
		case 6:
			System.out.println("Type: " + type[5][0]);
			System.out.println("Attributes: " + type[5][1]);
			break;
		case 7:
			System.out.println("Type: " + type[6][0]);
			System.out.println("Attributes: " + type[6][1]);
			break;
		case 8:
			System.out.println("Type: " + type[7][0]);
			System.out.println("Attributes: " + type[7][1]);
			break;
		case 9:
			System.out.println("Type: " + type[8][0]);
			System.out.println("Attributes: " + type[8][1]);
			break;
		case 11:
			System.out.println("Type: " + type[9][0]);
			System.out.println("Attributes: " + type[9][1]);
			break;
		case 22:
			System.out.println("Type: " + type[10][0]);
			System.out.println("Attributes: " + type[10][1]);
			break;
		default:
			System.out.println("Type: " + type[8][0]);
			System.out.println("Attributes: " + type[8][1]);
			break;
		}
	}
}
