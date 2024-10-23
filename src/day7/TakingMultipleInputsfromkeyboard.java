package day7;

import java.util.Scanner;

public class TakingMultipleInputsfromkeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
//ex 1
System.out.println("enter first number:");
int num1=sc.nextInt();

System.out.println("enter second number:");
int num2=sc.nextInt();

System.out.println("addition of 2numbers:"+(num1+num2));


//ex 2
System.out.println("enter name:");
String name=sc.next();
System.out.println("enter name:"+name);
System.out.println("enter your age:");
int age=sc.nextInt();
System.out.println("your age is:"+age);
System.out.println("enter unknown value:");
Object value=sc.next();
System.out.println(value);
	}

}
