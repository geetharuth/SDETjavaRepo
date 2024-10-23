package day3;

public class Incrementaloperators {

	public static void main(String[] args) {
		// ++ is called increment operator
		//case 1
		int a=10;
		System.out.println(a);
		
		   a++;                  //a=a+1;
		System.out.println(a);
	
		//case 2 post increment
		int result= a++;// //first assingment next increment will happen
		System.out.println(result);
		System.out.println(a);
		
		//case 3 pre increment 
		int res=++a; //first increment next assignment will happen
		System.out.println(res);
		System.out.println(a);
		
		
		
		
		

	}

}
