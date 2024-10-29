package com.june.interview;

public class StaticConcept {


   static 	int x =10;

   static {


	   ++x;
   }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticConcept sc= new StaticConcept();

		System.out.println(StaticConcept.x);
		System.out.println(x);


	}

}
