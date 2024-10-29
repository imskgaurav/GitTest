package com.sdetclub.programs;

import java.util.Arrays;

public class LargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\\

		int[] ar = { 23, 565, 22, 11, 121 };

		findLargestElmArt(ar);
		
		int x=findLargestElmfromArray(ar);
		
		System.out.println(x);
		
		int secLar=find2ndLargeValFromArray(ar);
		
		System.out.println("2nd Largest is :"+secLar);

	}

	// using Bruteforce//
	public static void findLargestElmArt(int[] arr) {
		int len = arr.length;
		Arrays.sort(arr);
		System.out.println("Largest element is " + arr[len - 1]);

	}
	
	//using optimal apporach
	
	
	  public static int findLargestElmfromArray(int arr[]) {
		  
		  int max = arr[0];
		  
		  for (int x: arr) {
			  
			  if (x>max) {
				  
				  max= x;
			  }
		  }
		  
		  
	  
		  return max;
	  }
	
	public static int find2ndLargeValFromArray(int [] arr) {
		
		
		int secLar = -1;
		
		int lar=findLargestElmfromArray(arr);
		
		for (int i=0; i<arr.length; i++) {
			
			if(arr[i]>secLar && arr[i] !=lar) {
				
				secLar= arr[i];
			}
		}
		
		return secLar;
	}
}