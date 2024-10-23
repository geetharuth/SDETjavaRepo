package day5;

public class Whileloopdemo {

	public static void main(String[] args) {
		//example1: print 1-----10 numbers
		int i=1;  //initilization
		while(i<=10)//condition
		{
			System.out.println(i);
			i++; //inc 
		}
		//example 2: print hello messaz 10times
		int x=1;
		while(x<=10)
		{
			System.out.println("hello");
			x++;
		}
//example 3: print even number between 1------10
		//approach 1	
		int y=1;
		while(y<=10)
		{
			System.out.println(y);
			y+=2; //y=+2
		}
		//approach 2
		int z=1;
		while(z<=10)
		{
			if(z%2==0)
			{
				System.out.println(z);
				
			}
			z++;
		}
	//example 4 : print odd and even numbers 1-----10
		int a=1;
		while(a<=10)
		{
			if(a%2==0)
			{
				System.out.println(a+"Even");
			}
			else
			{
				System.out.println(a+"odd");
			}
			a++;
		}
		//example 5: print 10------1
		int b=10;
		while(b>0)
		{
			System.out.println(b);
			b--;
		}
		
		
	}

}
