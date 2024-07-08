package ashokIT;

public class TestExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//implemented Abstract method from interface Test2//
		Test2 sum = (x, y)->((x+y)>=99);
		
		
		//TestExample te = new TestExample();
		
		System.out.println(sum.add(99, -10));
		

	}

}
