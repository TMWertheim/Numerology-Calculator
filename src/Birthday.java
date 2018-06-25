/* This class utilizes Polymorphism by setting variables to be passed into 
 another class.
 * Created by Tamara Wertheim.*/

class Birthday {
	private String month;
	private int day;
	private int year;

	public Birthday(String month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setYear(int year) {
		this.year = year;
	}

	/** @return a String input by the user by the name month**/
	public String getMonth() {
		return month;
	}
	
	/** @return a int input by the user by the name year**/
	public int getYear() {
		return year;
	}

	/** @return a int input by the user by the name day**/
	public int getDay() {
		return day;
	}

	/** @return previously stored variables*/
	public void DisplayDay() {
		System.out.println();
		System.out.println("The entered input is:");
		System.out.println(getMonth() + " " + getDay() + ", "+ getYear());
	}
}