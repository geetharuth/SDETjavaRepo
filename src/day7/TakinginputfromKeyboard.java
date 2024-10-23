package day7;

import java.util.Scanner;

public class TakinginputfromKeyboard {

	public static void main(String[] args) {
		// keyboard actions
		//int num=20; //hard coded value
		//System.out.println(num);

		
		//keyboard inputs
		Scanner sc=new Scanner(System.in);
		//numbers only
	/*	System.out.println("enter a number:");
		int num=sc.nextInt();
		System.out.println("given number is:"+num);*/
		
		//decimals only
	/*	System.out.println("enter a number:");
		double num1=sc.nextDouble();
		System.out.println("given number is:"+num1);*/
		
		
		//string only
		System.out.println("enter a city:");
		String city=sc.next();
		System.out.println("given city is:"+city);
		
	}

}
