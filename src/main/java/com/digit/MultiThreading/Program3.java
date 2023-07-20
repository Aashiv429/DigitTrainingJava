package com.digit.MultiThreading;
import java.util.Scanner;

class Banking1 implements Runnable{
	public void run(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter acc. no. :  ");
		int acc_no = sc.nextInt();
		System.out.println("Enter the pin:  ");
		int pin = sc.nextInt();
		System.out.println("Banking Completed");
	}
}

class Printing1 implements Runnable{
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

class Add1 implements Runnable{
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

public class Program3 {
public static void main(String[] args) {
	System.out.println("main start");
	Banking1 b = new Banking1();
	Thread t1= new Thread(b);
	t1.setName("Printing");
	t1.setPriority(4);
	
	
	Printing1 p = new Printing1();
	Thread t2= new Thread(p);
	t2.setName("Printing");
	t2.setPriority(4);
	
	Add1 a = new Add1();
	Thread t3= new Thread(a);
	t3.setName("Add");
	t3.setPriority(6);
	
	t1.start();
	t2.start();
	t3.start();
	System.out.println("main terminated");
}
}
