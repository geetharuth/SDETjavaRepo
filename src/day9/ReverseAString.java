package day9;

public class ReverseAString {

	public static void main(String[] args) {
		// approach 1 ---length(),charat()
	/*	String r="selenium";
		String rev="";
		for(int i=r.length()-1;i>=0;i-- )
		{
			rev=rev+r.charAt(i);
		}
		System.out.println("reverse string is:"+rev);
	}*/

	//approach 2 -- by converting string to char array type
	String Str="welcome";
	String rev="";
	char a[]=Str.toCharArray();
	for(int i=a.length-1;i>=0;i--)
	{
		rev=rev+a[i];
	}
	System.out.println("reverse string is:"+rev);
	
	//approach 3: using stringbuffer class
	StringBuffer sb=new StringBuffer("welcome");
	System.out.println("reverse string is:"+sb.reverse());
	
	
	//approach 4: using striingbuffer class
	StringBuilder sbu=new StringBuilder("welcome");
	System.out.println("reverse string is:"+sbu.reverse());
	
	
}
}

