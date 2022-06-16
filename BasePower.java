package com.loop_exercise;

import java.util.Scanner;

public class BasePower {
public static void main(String[]args) {
	int baseNum;
	int powerNum;
	int value = 1;
	Scanner powerbase=new Scanner(System.in);
	
	System.out.println("Enter the base number :");
	baseNum=powerbase.nextInt();
	
	System.out.println("Enter the power number :");
	powerNum=powerbase.nextInt();
	
	for(int i=1;i<=powerNum;i++) {
		value *=baseNum;//in this i will calculate like multiply the value by base until the number assigned to power becomes zero.
		//for eg: baseNum=2 powerNum=2 value=1
		//multiply value by baseNum until powerNum becomes zero
		//so 1*2*2=4
	}
	System.out.println("Result :"+value);
}
}
