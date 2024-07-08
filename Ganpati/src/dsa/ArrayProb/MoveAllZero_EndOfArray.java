package dsa.ArrayProb;

public class MoveAllZero_EndOfArray {


	 public static void main(String[] args) {


		 int[] arr1= {3,4,0,6,0,4,55,0};


		 int len = arr1.length;


		 int[] temp = new int[len];

		  //Iterate Array from o to n :
		 int count=0;

		 for (int i=0; i<len; i++) {

			 //Check each Index Value : Store it in temp Array;


			 if(arr1[i]!=0) {

				 temp[count]= arr1[i];

				 ++count;
			 }


		 }

		 System.out.println("Total Count of Non Zero is :"+count);

		 //Add the zERO  from the Index where temp Array is Blank

		    for(int k =count;k<len; k++) {

		    	temp[k]= 0;
		    }
		 //Now Iterate the  temp Array //


		 for(int i: temp) {

			 System.out.print(i+" ");
		 }




	}





}

