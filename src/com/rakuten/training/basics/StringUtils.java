package com.rakuten.training.basics;

import java.util.Arrays;

import com.rakuten.training.basics.LamdaDemo;

public class StringUtils {
	
	public int eChecker(String s1,String s2){
		if(s1.contains("e") && !s2.contains("e")) {
			return -1;
		}else if(!s1.contains("e") && s2.contains("e")) {
			return 1;
		}else {
			return 0;
		}
	}

	
	public static <T> T betterString(T s1,T s2,TwoStringPredicate<T> decider) {
		if(decider.isFirstBetterThanSecond(s1, s2)) {
			return s1;
		}else {
			return s2;
		}
	}
	
	public static void main(String[] args) {
		String[] s = {"Apple","Banana","Mango","Pineapple","Watermelon"};
		
		Arrays.sort(s, (s1,s2)-> s1.length() - s2.length());
		System.out.println(Arrays.asList(s));
		Arrays.sort(s, (s1,s2)-> s2.length() - s1.length());
		System.out.println(Arrays.asList(s));
		Arrays.sort(s, (s1,s2)-> s1.substring(0,1).compareTo(s2.substring(0,1)));
		System.out.println(Arrays.asList(s));
		StringUtils obj = new StringUtils();
		Arrays.sort(s,obj::eChecker);
		System.out.println(Arrays.asList(s));
		
		System.out.println(betterString("Heello","Hello", (s1, s2) -> s1.length() > s2.length()));
		
	}

}

