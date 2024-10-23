package day5;

public class ForLoopDemo {

	public static void main(String[] args) {
		// ex : 1   1------10 numbers
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
			System.out.println("----------------");
		// ex : 2   1------10 even numbers
				for(int j=2;j<=10;j=j+2)
				{
					System.out.println(j);
				}
				System.out.println("----------------");
				
				//ex : 3   1------10 even numbers
				for(int k=1;k<=10; k++)
				{
					if(k%2==0)
					{
						System.out.println(k+"even");
					}
					else
					{
						System.out.println(k+"odd");
					}
				}
				System.out.println("----------------");
					//ex : 4 10-------1 desc
					for(int z=10;z>=0;z--)
					{
						System.out.println(z);
					}
					System.out.println("----------------");
				}
	
}

