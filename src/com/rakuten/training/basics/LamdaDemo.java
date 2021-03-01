package com.rakuten.training.basics;

import java.util.Arrays;

public class LamdaDemo {
	
	public static void main(String args[])
	{
		String[] s = {"Apple","Banana","Mango","Pineapple","Watermelon"};
		Arrays.sort(s,(s1,s2)->s1.length()-s2.length());
		System.out.println(Arrays.asList(s));
		Arrays.sort(s,(s1,s2)->{return s2.length()-s1.length();});
		System.out.println(Arrays.asList(s));
	}
}
