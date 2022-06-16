package com.loop_exercise;

public class Fibonacci {

	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		int sum=0;
		System.out.print(num1+" "+num2 );// 0 1
		for(int i=1;i<10;i++) {
			sum=num1+num2;//0+1=1
			System.out.print(" "+sum );//1 2 3
			num1=num2;//1 1
			num2=sum;//1 2
		}

	}

}
