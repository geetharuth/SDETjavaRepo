package day9;

public class StringVSStringBufferVSStringBuilder {

	public static void main(String[] args) {
		//String -immutable
		String s="welcome";
		s.concat("java");
		//welcome
		System.out.println(s);//immutable,cannot change original value of s
		
		//stringbuffer-mutable
		StringBuffer s1=new StringBuffer("welcome");
		s1.append("to java");
		System.out.println(s1);//mutual,we can change original value to s1//welcome to java
		
		
		
		//stringbuffer-mutable
				StringBuilder s3=new StringBuilder("welcome");
				s3.append("to java");
				System.out.println(s3);//mutual,we can change original value to s3	//welcome to java
				
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
