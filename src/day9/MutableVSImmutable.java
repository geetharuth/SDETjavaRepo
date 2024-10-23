package day9;

import java.util.Arrays;

public class MutableVSImmutable {

	public static void main(String[] args) {
		// mutable ---can change
		int a[]= {20,10,40,50,30};
		System.out.println(Arrays.toString(a));
Arrays.sort(a);//mutable 
System.out.println(Arrays.toString(a));

//imutual -we cannot change
String s=new String("welcome");
System.out.println(s);
String concatstring=s.concat("object");

//s.concat(concatstring);
System.out.println(s);//welcome -- immutable we cannot change
System.out.println(concatstring);

	}

}
