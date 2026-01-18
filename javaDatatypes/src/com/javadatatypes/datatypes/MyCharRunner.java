package com.javadatatypes.datatypes;

public class MyCharRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyChar myChar = new MyChar('a');

		// System.out.println(myChar.isVowel()); // a,e,i,o,u and capitals

		System.out.println(myChar.isNumber());
		// System.out.println(myChar.isAlphabet());

		MyChar.printLowerCase();
		MyChar.printUpperCase();

	}

}
