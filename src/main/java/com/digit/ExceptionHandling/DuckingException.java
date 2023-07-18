package com.digit.ExceptionHandling;

import java.util.Scanner;

class Operation{
void function1() throws Exception{
	System.out.println("Inside func 1");
	Scanner sc = new Scanner(System.in);
	System.out.println("Division Operation");
	System.out.println("Enter Numerator");
	int num = sc.nextInt();
	System.out.println("Enter Denominator");
	int den = sc.nextInt();
	
	int res = num/den;
	System.out.println("Division result is " + res);
	System.out.println("left func1");
}
void function2() throws Exception{
	System.out.println("inside func2");
	function1();
	System.out.println("left func2");
}
void function3() {
	try {
		System.out.println("inside func3");
		function2();
	}
	catch(Exception e)
	{
		System.out.println("exception handled");
	}
	System.out.println("left func3");
}
}

public class DuckingException {
public static void main(String[] args) {
	System.out.println("inside main");
	Operation op = new Operation();
	op.function3();
	System.out.println("left main");
}
}
