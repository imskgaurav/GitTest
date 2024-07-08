import java.util.stream.IntStream;

public class ArraysRangePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {5,8,9,5,7,4,3,2,88};

		//System.out.println(Arrays.toString(betweenRange(1, 4)));

		printRangeOfInts(arr, 3, 6);

	}



	public static int[] betweenRange(int a, int b) {



		return IntStream.range(a, b).toArray();
	}


	public static void printRangeOfInts(int arr[], int x, int y) {


		for(int i= arr.length-x; i>=arr.length-y; i--) {

			  System.out.println(arr[i]);
		}


	}

}
