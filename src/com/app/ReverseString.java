package com.app;

public class ReverseString {
	
	void getReversedString(String input) {
		char[] c = input.toCharArray();
		String result = "";
		for(int i = c.length - 1; i >= 0 ;i--) {
			result += c[i];
		}
		 System.out.println(result);
	}

}
