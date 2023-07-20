package com.digit.MultiThreading;

import java.util.Scanner;

public class Program1 {
public static void main(String[] args) throws InterruptedException{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter acc. no. :  ");
	int acc_no = sc.nextInt();
	System.out.println("Enter the pin:  ");
	int pin = sc.nextInt();
	System.out.println("Banking Completed");
	
	System.out.println("printing operation");
	for(int i =0;i<5;i++)
	{
		System.out.println("Good Morning");
		Thread.sleep(3000);
	}
	System.out.println("Printing completed");
	
	System.out.println("Addition Operation");
	System.out.println("Enter the num1");
	int num1 = sc.nextInt();
	System.out.println("Enter the num2");
	int num2 = sc.nextInt();
	int res = (num1+num2);
	
	System.out.println("The result is: " + res);
	System.out.println("Addition Completed");
}
}
