// L00150620 - Jamie McGee

package ClassTester;

import java.util.Scanner;
import ClassTester.Date;

public class DateTester {
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);

		d1.setDay(4);
		d1.setMonth(6);
		d1.setYear(1941);

		System.out.println(d1);

		Date d2 = new Date(28, 12, 1982);
		System.out.println(d2);

		if (d1.equals(d2))
			System.out.println("Date's are equal.");
		else
			System.out.println("Date's are not equal.");

		boolean goodInput = false;
		// int d, m, y;

		// Scanner kbIn = new Scanner(System.in);

		// do {
		// 	try {
		// 		Date dateTest = new Date();

		// 		System.out.println("Enter day [1-31]: ");
		// 		d = kbIn.nextInt();

		// 		System.out.println("Enter month [1-12]: ");
		// 		m = kbIn.nextInt();

		// 		System.out.println("Enter year [1900-2023]: ");
		// 		y = kbIn.nextInt();

		// 		dateTest.setDay(d);
		// 		dateTest.setMonth(m);
		// 		dateTest.setYear(y);
		// 		System.out.println(dateTest);
		// 		goodInput = true;

		// 	} catch (IllegalArgumentException iAE) {
		// 		System.out.println("Invalid date..");
		// 	}
		// } while (!goodInput);

		// goodInput = false;

		// do {
		// 	try {
		// 		Date dateTest2 = new Date(1, 12, 2000);
		// 		System.out.println(dateTest2);
		// 		goodInput = true;
		// 	} catch (IllegalArgumentException iAE) {
		// 		System.out.println("Invalid Date..");
		// 	}
		// } while (!goodInput);

	}
}