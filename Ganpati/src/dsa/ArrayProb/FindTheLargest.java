package dsa.ArrayProb;

public class FindTheLargest {


	static int findLargestFromArray(int arr[], int size){

		// Assume that Largets is at First index
		int  max_Val= arr[0];

		//Now Iterate throught Array and compare with each Value of Array

		for(int i =1; i<size; i++) {

			if(arr[i]>max_Val) {

				System.out.println("Next Val is greater than Assumed  value");

				max_Val=arr[i];//Swaping with Largest val ;

				System.out.println("iteration "+ i+ "FOUND MAX val"+max_Val);


			}



		}

		return max_Val;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = { 34, 56,88, -189,45,89,444};

		int res=  findLargestFromArray(a, 7);

		System.out.println(res);

	}

}
