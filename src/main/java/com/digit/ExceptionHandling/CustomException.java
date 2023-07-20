package com.digit.ExceptionHandling;

import java.util.Scanner;

class UnderAgeException extends Exception{
	public String getMessage()
	{
		return "Your age is under 18, please try after few years";
	}
}

class OverAgeException extends Exception{
	public String getMessage()
	{
		return "Your age is more than 60, hence stop having some desires";
	}
}

class Candidate{
	int age;
	void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		age = sc.nextInt();
	}
	void verify() throws Exception{
		if(age>18)
		{
			UnderAgeException uae = new UnderAgeException();
			System.out.println(uae.getMessage());
		}
		else if(age>60)
		{
			OverAgeException oae = new OverAgeException();
			System.out.println(oae.getMessage());
		}
		else {
			
			System.out.println("issue a license");
		}
	
	}
}
class Nested{
	void grantLicense(Candidate c)
	{
		try {
			c.getData();
			c.verify();
		}
		catch(Exception e1)
		{
			try {
				c.getData();
				c.verify();
			}
			catch(Exception e2)
			{
				try {
					c.getData();
					c.verify();
				}
				catch(Exception e3)
				{
					System.out.println("Exception Handled");
				}
			}
			
		}
	}
	
}

//class RTO{
//	void grantLicense(Candidate c)
//	{
//		try {
//			c.getData();
//			c.verify();
//		}
//		catch(Exception e)
//		{
//			System.out.println("Exception Handled");
//		}
//	}
//}
public class CustomException {
public static void main(String[] args) {
	Candidate c = new Candidate();
	Nested rto = new Nested();
	rto.grantLicense(c);
}
	
}
