package dsa.ArrayProb;

public class LinearSearch_Program {



	static int linearSearchAlgo(int arr[], int searchElm){

		int i;
		for( i =0; i<3; i++) {

			System.out.println("Loop count :"+i);
			if(arr[i]==searchElm) {

				System.out.println("Value matches at index:"+ i);
				return i;

			}
			System.out.println("Outisde IF");
	}
		return -1;


		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int[] arr = {2, 7,9};

		 int index= linearSearchAlgo(arr, 7);

		 	System.out.println(index);
	}

}
