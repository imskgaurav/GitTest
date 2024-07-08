import java.util.Arrays;

public class ArrayCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4};
		int b[] = {1,2,3,4};

		System.out.println(Arrays.equals(a, b));
		int c[] = {1,2,4,3};

		System.out.println(Arrays.equals(a, c));

	}

}
