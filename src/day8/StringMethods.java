package day8;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String s=new String("welcome");
//System.out.println(s);

//length() ------ returns of a string/number of characters
//String s="welcome";
//System.out.println(s.length());//7
//System.out.println("welcome".length());//7


//concat()------ joining strings
String s1="welcome";
String s2="to java";
String s3="automation";
System.out.println(s1.concat(s2));//welcome to java
System.out.println(s1+s2+s3);//welcome to java  automation
System.out.println(s1.concat(s2+s3));//welcome to java automation
System.out.println("welcome+to java");//welcome to java
System.out.println("welcome".concat("to java"));//welcometo java

//trim()-----remove spaces right and left side
String s="   welcome   ";
System.out.println(s);//print string along spaces
System.out.println(s.trim());

//before trimming
System.out.println(s);//print string along with spaces
System.out.println("Before trimming:"+s.length());
System.out.println(s.trim());
System.out.println("after trimmed:"+s.trim().length());


//charat()------returns a charcter from a string based on index
String z="Welcome";
System.out.println(z.charAt(3));//char
System.out.println(z.charAt(0));//w


//contains()---returns true/false
System.out.println(s.contains("wel"));//true
System.out.println(s.contains("come"));//true
System.out.println(s.contains("Wel"));//false
System.out.println(s.contains("Come"));//false

//equals(), equalsignorecase()-compare strings
String z1="welcome";
String z2="Welcome";
System.out.println(z1==z2);//true
System.out.println(z1.equals(z2));//true
System.out.println(z1.equals("Welcome"));//false
System.out.println(z1.equalsIgnoreCase("welcome"));//true

//replace()-- replace single/multiple(sequence) of charcters in a string 
String a="Welcome to selenium java selenium python selenium c#";
System.out.println(a.replace("selenium", "playwright"));



//substring()-------extract substring from the main string
//startign idex--0
//ending idex---1
String b="selenium";
System.out.println(b.substring(0,3));//sel


//touppercase()  tolowercase()
String q="Welcome";
System.out.println(q.toUpperCase());//WELCOME
System.out.println(q.toLowerCase());//welcome


//split()----split the string multiple parts based on delimeter
String m="abc@gmail.com";
System.out.println(m.substring(0,3));//abc
String m1[]=m.split("@");
System.out.println(m1[0]);//abc
System.out.println(m1[1]);//gamil.com
System.out.println(Arrays.toString(m1));//[abc, gmail.com]

//ex1
String amount="$15,20,55";//exp 152055
System.out.println(amount.replace("$", " "));//15,20,55
System.out.println(amount.replace("$", " ").replace(",", " "));//15 20 55


//ex2
String D="abc 123";
String ar[]=D.split(" ");
System.out.println(Arrays.toString(ar));//[abc, 123]

//* % ^ & ()---you cannot use as delimeters

	}

}
