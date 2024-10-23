package day3;

public class OperatorsDemo {

	public static void main(String[] args) {
		// 1) arthemetic operators +,-,*,/,%
		int a=20,b=10;
		System.out.println("sum of a and b is:"+(a+b));
		System.out.println("diff of a and b is:"+(a-b));
		System.out.println("multiplication of a and b is:"+(a*b));
		System.out.println("division of a and b is:"+(a/b)); //quetiont value
		System.out.println("modulo division of a and b is:"+(a%b));//reminder value
		
		//int result =a+b;
		//System.out.println(result);
		
		//2) Relational comparison operators > >= < <= != ==
		//always returns boolena value-true/false
		System.out.println(a>b);//true
		System.out.println(a<b);//false
		System.out.println(a>=b);//true
		System.out.println(a<=b);//false
		b=20;
		System.out.println(a<=b);//true
		System.out.println(a>=b);//true
		System.out.println(a!=b);//false
		System.out.println(a==b);//true
		boolean result =a>b;
		System.out.println(result);
		
		//3) Logical operators && || !
		//returns boolean value =true/false
		//works between 2 boolean values
		
		Boolean x=true;
		boolean y=false;
		System.out.println(x && y);//false
		System.out.println(x||y);//true
		System.out.println(!x);//false
		System.out.println(!y);//true
		
		boolean b1=10>20;
		System.out.println(b1);//false
		
		boolean b2=20>10;
		System.out.println(b2);//true
		
		System.out.println(b1 && b2);//false
		System.out.println(b1 || b2);//true
		System.out.println(!b1);//true
		System.out.println(!b2);//false
		System.out.println((10<20)&&(20>10));//true
		
		

	}

}
