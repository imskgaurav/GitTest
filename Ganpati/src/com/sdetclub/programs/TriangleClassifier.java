package com.sdetclub.programs;

import java.util.Scanner;

public class TriangleClassifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc = new Scanner(System.in);
			System.out.println("pls eneter side");
			
			    int sides1 = sc.nextInt();
		        int sides2 = sc.nextInt();
		        int sides3 = sc.nextInt();
		        
		        System.out.println(sides1+ " "+sides2+ " "+sides3);

		        if((sides1==sides2)&&(sides2==sides3)) {
		        	
		        	System.out.println("equilateral triangle");
		        }
		        	else if((sides1==sides2)||(sides2==sides3)||(sides1==sides3)){
		        		System.out.println("Isoscles");
		        		
		        	}else if((sides1!=sides2)&&(sides2!=sides3)&& (sides1!=sides3)) {
		            
		        		 System.out.println("Scalane Triangle");
		        		
		        	
		        }

}
}