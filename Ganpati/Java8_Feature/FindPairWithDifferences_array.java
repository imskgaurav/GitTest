
public class FindPairWithDifferences_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int[] arr = { 1, 8, 30, 40, 100 };
	        //int n = arr.length;
	        int diff =-60;

	        findPair(arr, diff);

	}


	public static void findPair(int a[], int diff) {

		for (int i=0; i<a.length; i++) {

			for(int j=i+1; j<a.length; j++) {

				if((a[i]-a[j]==diff)||(a[j]-a[i]==diff)) {

					System.out.println("Pair Found");
					System.out.println("Pair is: (" + a[i] + ", " + a[j] + ")");
                    return;
				}

			}
		}
		 System.out.println("No such pair");
	}

}
