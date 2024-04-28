import java.util.Arrays;
import java.util.List;

public class PrintEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> l1 = Arrays.asList(3,7,10,12,4,6);
		
		System.out.println(l1);
		
		l1.stream().filter(e->e%2==0).forEach(System.out::println);
		
		
		

	}

}
