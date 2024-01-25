package StriverDSA;

import java.util.Scanner;

public class CheckAdult {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Age:");
		int age = scanner.nextInt();
		if (age >= 18) {
			System.out.println("Adult");
		} else {
			System.out.println("Not Adult");
		}
	}

}
