package com.Aparana;

import java.util.Scanner;

public class CalculatorApplication {

	public static void main(String[] args) {

		Calculation cal = new Calculation();
		Scanner sc = new Scanner(System.in);
		System.out.println("---- Calculator---------");

		for (int j = 1; j < 5; j++) {
			System.out.println("\nHere are your options:");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Division");
			System.out.println("4. Multiplication");
			// System.out.println("5. Find Acres into square(m2)");
			System.out.println("5. Add Two String/character");
			System.out.println("6. press 0 exist loop");

			System.out.print("\nWhat would you like to do?: ");
			int choice = sc.nextInt();
			if (choice == 0) {
				System.out.println("thank you :)");
				System.exit(0);
			}
			/*
			 * else if (choice == 5) { System.out.println("enter any number for find acre");
			 * int n2 = sc.nextInt(); System.out.println("Acres into square value is :" +
			 * cal.ac(n2)); }
			 */
			if(choice!= 5) {
			System.out.println("\nenter first number");
			int first_number = sc.nextInt();
			System.out.println("enter second number");
			int second_number = sc.nextInt();
			if (choice == 1) {
				
				System.out.println("addition is :" + cal.add(first_number, second_number));
			} else if (choice == 2) {
				
				System.out.println("subtraction is :" + cal.subtract(first_number, second_number));
			} else if (choice == 3) {
				
				try {

					System.out.println("division is :" + cal.divide(first_number, second_number));

				} catch (InvalidArgumentsException e) {
					System.out.print(e.getMessage());
				}
			} else if (choice == 4) {
				
				System.out.println("multiplication is :" + cal.multiple(first_number, second_number));
			}
		}else if (choice == 5) {
				Scanner sc1 = new Scanner(System.in);
				System.out.println("enter first string");
				String first_character = sc1.nextLine();

				System.out.println("\nenter second  string");
				String second_character = sc1.nextLine();

				System.out.print("Add string result is :" + cal.add(first_character, second_character));

			}
			System.out.println();

		}

	}

}
