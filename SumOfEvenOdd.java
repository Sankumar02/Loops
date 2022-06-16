package com.loop_exercise;

import java.util.Scanner;

//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
public class SumOfEvenOdd {

	public static void main(String[] args) {
		int num;
		int sumOfEven = 0;
		int sumOfOdd = 0;
		Scanner number = new Scanner(System.in);
		char choice;
		do {
			System.out.println("enter the number");
			num = number.nextInt();
			if (num % 2 == 0) {
				sumOfEven += num;
			} else {
				sumOfOdd += num;
			}
			System.out.print("Do you want to continue y/n? ");
			choice = number.next().charAt(0);

		} while (choice == 'y' || choice == 'Y');

		System.out.println("The sum of even integers :" + sumOfEven);
		System.out.println("The sum of odd integers :" + sumOfOdd);
	}

}
