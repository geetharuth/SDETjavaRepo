package day6;

public class Objectarray {

	public static void main(String[] args) {
		// Object array
		Object a[]= { 100,10.5,"string",'a',true};
		for(Object x: a)
		{
			System.out.println(x);
		}
		for(int i=0;i<a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
		

	}

}
