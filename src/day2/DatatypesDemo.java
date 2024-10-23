package day2;

public class DatatypesDemo {

	public static void main(String[] args) {
		// Numeric data types
		int a=100, b=200;
		System.out.println("the value of a is:"+a);
		System.out.println("the value of b is:"+b);
		System.out.println(a+b);
		System.out.println("the sum of a and b is:"+a+b);

		byte by=125;
		System.out.println(by);
		short sh=3535;
		System.out.println(sh);
		long i=212123214233521l; //literal is needed L/l
		System.out.println(i );
		
		//decimals numbers -float,double
		float  iteam_price=15.5f;//literal is needed F/f
		System.out.println( iteam_price);
		
		double dbl=1234.423548;
		System.out.println(dbl);
		
		char grade='a';
		System.out.println(grade);
		
		String name="John";
		System.out.println(name);
		
		/*  char ch='abc'; //invalid
		String ch=abc;//invalid
		String ch="a"; //valid
		String ch ='a'; //invalid  */
		
		boolean bl=false; //allows only true/false
		System.out.println(bl);
		
	/*	boolean bl="true";//invalid
		boolean bl="false";//invalid
		String bl=true; //invalid */
		String bi="true";//valid  
		System.out.println(bi);
		
		
	final int  bia=100;
	System.out.println(bia);
		
		
	}

}
