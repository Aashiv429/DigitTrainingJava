package com.digit.ExceptionHandling;

import java.util.Scanner;

public class TryCatch {
public static void main(String[] args) {
	try(Scanner sc = new Scanner(System.in))
	{
		
		System.out.println("Division Operation");
		System.out.println("Enter Numerator");
		int num = sc.nextInt();
		System.out.println("Enter Denominator");
		int den = sc.nextInt();
		
		int res = num/den;
		System.out.println("Division result is " + res);
		
		System.out.println("Array Operation");
		System.out.println("enter the size of the array");
		int n = sc.nextInt();
		int arr[]=new int[n];
		int arr1[]=null;
		
		System.out.println("enter the position to which value has to be added: ");
		int pos = sc.nextInt();
		System.out.println("enter the value to be added: ");
		int val = sc.nextInt();
		arr[pos] = val;
		System.out.println("data added into the array");	
	}
	catch(ArithmeticException e1){
		System.out.println("Arithmetic Exception");
	}
	catch(NegativeArraySizeException e2){
		System.out.println("NegativeArraySizeException ");
	}
	catch(ArrayIndexOutOfBoundsException e3){
		System.out.println("ArrayIndexOutOfBoundsException");
	}
	catch(NullPointerException e4){
		System.out.println("NullPointerException");
	}
	catch(Exception e1){
		System.out.println(" Exception handle by generic exception");
	}
}
}
