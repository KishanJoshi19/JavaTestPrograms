package com.javadatatypes.datatypes;

public class MyChar {

	private Object ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	/*
	 * public boolean isVowel() { // TODO Auto-generated method stub
	 * 
	 * if (ch == 'a') { return true; }
	 * 
	 * return false; }
	 */

	public boolean isNumber() {
		// TODO Auto-generated method stub
		return true;
	}

	public static void printLowerCase() {
		// TODO Auto-generated method stub
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}
	}

	public static void printUpperCase() {
		// TODO Auto-generated method stub
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}
	}
}
