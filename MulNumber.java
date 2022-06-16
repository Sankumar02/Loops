package com.loop_exercise;

import java.util.Scanner;

public class MulNumber {

	public static void main(String[] args) {
		int mul = 1;
		int num;
		Scanner multiply=new Scanner(System.in);	
		System.out.println("Enter the integer(enter 0 to exit)");
		num=multiply.nextInt();
		while(num<=10|num!=0) {
			mul=mul*num;
			num++;
			System.out.println("Enter the integer(enter 0 to exit)");
			num=multiply.nextInt();		
		}
		//Display the total multiplied.
		System.out.println("The multiplication of the positive integer :"+mul);
	}

}

