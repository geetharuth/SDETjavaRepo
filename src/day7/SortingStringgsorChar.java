package day7;

import java.util.Arrays;

public class SortingStringgsorChar {

	public static void main(String[] args) {
		// sorting char
		//char s[]= {'d','c','b','a'};
		String s[]= {"scott","marry","johhn","david"};
		System.out.println("before sorting-----"+Arrays.toString(s));
		Arrays.sort(s);
		System.out.println("after sorting-----"+Arrays.toString(s));

	}

}
