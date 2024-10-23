package day5;

public class Breakandcontinue {

	public static void main(String[] args) {
		// break
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
					break; 
			}
			
			System.out.println(i);
		}
		for(int z=1;z<=10;z++)
		{
			if(z==1 || z==5 || z==10)
			{
				continue;
			}
			System.out.println(z);
		}
		
		{
			
		}

	}

}
