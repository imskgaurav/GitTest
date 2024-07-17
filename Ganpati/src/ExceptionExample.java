
public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i =1;
		
		int j = i++;
		System.out.println(i);
		System.out.println(j);
		int x= 5;
		System.out.println(x++ + ++x);
		                    //5 +7 
		
		
		try {
			
			throw new Exception("Java");
			
		}
		catch(Exception e) {
			
			System.out.println("Exception Handle");
		}

	}

}
