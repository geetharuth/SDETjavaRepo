package day6;

public class TwodimensionalArray {

	public static void main(String[] args) {
		// declaring array
		//approach 1 
	/*	int a[][]=new int [3][2];
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[1][2]=500;*/
		
		//approach 2
	/*	int b[][]= {{100,200},{300,400},{500,600}};*/
//or 
		int b[][]= {{100,200},
				{300,400},
				{500,600}
		};
		
		//find the size of an array
		System.out.println("no of rows:"+b.length);
		System.out.println("no of cols:"+b[0].length);
		
		//read single value from an array
		System.out.println(b[2][1]);
		System.out.println("=================");
//normal for
	/*	for(int r=0; r<=2;r++)
		{
			for(int c=0;c<=1;c++)
			{
				System.out.println(b[r][c]+"   ");
			}
			System.out.println();
		}*/
	//or 
		for(int r=0; r<=b.length-1;r++)
		{
			for(int c=0;c<=b[r].length-1;c++)
			{
				System.out.println(b[r][c]+"   ");
			}
			System.out.println();
		
			
			//enhanced for loop
			for(int arr[]: b)
			{
				for(int x : arr)
				{
					System.out.println(x+"    ");
				}
				System.out.println();
			}
		
		
		
		
	}

}
}
