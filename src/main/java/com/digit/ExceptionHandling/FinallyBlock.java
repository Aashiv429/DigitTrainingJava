package com.digit.ExceptionHandling;

import java.util.Scanner;

class Operation2{
void function1() throws ArithmeticException{
	try {
	System.out.println("Inside func 1");
	Scanner sc = new Scanner(System.in);
	System.out.println("Division Operation");
	System.out.println("Enter Numerator");
	int num = sc.nextInt();
	System.out.println("Enter Denominator");
	int den = sc.nextInt();
	int res = num/den;
	System.out.println("Division result is " + res);
	}
	catch(Exception e){
		System.out.println("exception handled in func1");
		throw e;
	}
	finally {
		System.out.println("left func 1");
	}
}
}
public class FinallyBlock {
	public static void main(String[] args) throws Exception{
		try {
		System.out.println("inside main");
		Operation2 op = new Operation2();
		op.function1();
		}
		catch(Exception e){
			System.out.println("exception handled in main");
		}
		finally {
			System.out.println("left main");
		}
		
	}
}
