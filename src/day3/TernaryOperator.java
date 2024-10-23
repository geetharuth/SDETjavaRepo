package day3;

public class TernaryOperator {

	public static void main(String[] args) {
		// var=expression? result1 : result2;
		//ex 1
	
		/*	int a=200, b=100;
		int x=(a>b) ? a:b;
		System.out.println(x); */
		
		/*int a =200,b=100;
		int x=(a<b)? a:b;
		System.out.println(x);*/
		
		//ex 2
	/*	int x=(1==1)? 100:200;
		System.out.println(x);*/
		
	/*	int x=(1==2)?200:100;
		System.out.println(x);*/
		
		//ex3
		int person_age=30;
		String res=(person_age>=18)? "eligile":"not elligible";
		System.out.println(res);
		
		
	}

}
