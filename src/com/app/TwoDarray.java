package com.app;

public class TwoDarray {
	
	void get2dStringArray(String arr[][]) {
		for(int i = 0; i < arr.length;i++) {
			for(int j = 0 ; j < arr[i].length;j++) {
				System.out.println(arr[i][j] + "");
			}
		}
	}

}
