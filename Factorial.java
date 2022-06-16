package com.loop_exercise;

import java.util.Scanner;

public class Factorial {
	public static void main(String []args) {
		int  num;
		int factorial=1;
		int i = 1;
		Scanner fact=new Scanner(System.in);
		System.out.println("Enter the Number");
		num=fact.nextInt();
		/*for(i=1;i<=num;i++) {
			factorial=factorial*i;
		}*/
		/*while (i<=num) {
			
			factorial=factorial*i;
			i++;
		}*/
		do {
			factorial=factorial*i;
			i++;
		}while(i<=num);
			
		System.out.println("the factorial of "+num+" is "+factorial);
	}

}
