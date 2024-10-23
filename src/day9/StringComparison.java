package day9;

public class StringComparison {

	public static void main(String[] args) {
		// case1
		String s1="welcome";
		String s2="welcome";
		System.out.println(s1==s2);//true
		System.out.println(s1.equals(s2));//true
		
		
		//case2
		String z1=new String("welcome");
		String z2=new String("welcome");
System.out.println(z1);
System.out.println(z2);
//compare the objects
System.out.println(z1==z2);//false
System.out.println(z1.equals(z2));//true


//case3
String a1="abc";
String a2=new String("abc");
System.out.println(a1==a2);//false
System.out.println(a1.equals(a2));//true

//case4
String x1="abc";
String x2=new String("abc");
String x3=x2;
System.out.println(x1==x2);//false
System.out.println(x1.equals(x2));//true
System.out.println(x2==x3);//true,becoz objects are same/equal
System.out.println(x2.equals(x3));//true
System.out.println(x1==x3);//false
System.out.println(x1.equals(x3));//true,values are same



	}

}
