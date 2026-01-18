package ArrayDemo;

public class DayNameRunner {

	public static void main(String[] args) {

		String[] strday = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thurseday", "Friday", "Saturday" };

		String dayWithMostChar = "";
		for (String day : strday) {
			if (day.length() > dayWithMostChar.length()) {
				dayWithMostChar = day;
			}
		}
		System.out.println("day with max char: " + dayWithMostChar);

		for (int i = strday.length - 1; i >= 0; i--) {
			System.out.println(strday[i]);
		}
	}
}
