package com.digit.MultiThreading;
import java.util.Scanner;

class Banking extends Thread{
	public void run(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter acc. no. :  ");
		int acc_no = sc.nextInt();
		System.out.println("Enter the pin:  ");
		int pin = sc.nextInt();
		System.out.println("Banking Completed");
	}
}

class Printing extends Thread{
	public void run()
	{
		System.out.println("printing operation");
		for(int i =0;i<5;i++)
		{
			try {
			System.out.println("Good Morning");
			Thread.sleep(3000);
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
		}
		System.out.println("Printing completed");
	}
}

class Add extends Thread{
	public void run()
	{
		Scanner sc = new Scanner(System.in);
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

public class Program2 {
public static void main(String[] args) {
	System.out.println("main start");
	Banking b = new Banking();
	b.setName("Banking");
	b.setPriority(3);
	Printing p = new Printing();
	p.setName("Printing");
	p.setPriority(4);
	Add a = new Add();
	a.setName("Add");
	a.setPriority(6);
	
	b.start();
	p.start();
	a.start();
	System.out.println("main terminated");
}
}
