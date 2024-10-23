package day6;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		// declaring array
//approach 1
		int a[]=new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		//approach 2
	/*	int b[]= { 100,200,300,400,500};*/
		
		//find length of an array
		System.out.println(a.length);
		System.out.println("length of an array:"+a.length);
		
		//read single value from an array
		System.out.println(a[4]); //here 4 is index
		
		//reading all the values from array
		//normal for loop 
		for(int i=0;i<=a.length-1;i++)   //i<=4   i<5   i<=a.length-1   i<a.length
		{
			System.out.println(a[i]);  //100 200 300 400 500
		}
		System.out.println("-----------------------------");
		//enhances for loop/for each loop
		for(int x :a)
		{
			System.out.println(x);
		}
	}

}
