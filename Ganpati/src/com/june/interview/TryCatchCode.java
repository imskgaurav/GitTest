package com.june.interview;

public class TryCatchCode {

	public static void main(String[] args) {




	try {

		  System.out.println("A");

		  int x= 99/0;
	}

	catch(ArithmeticException ae) {

		//System.exit(-2);

		throw new NullPointerException();

	}

	catch(Exception e) {

		System.out.println("A");
	}

	finally {

		System.out.println("D");
	}

}
}