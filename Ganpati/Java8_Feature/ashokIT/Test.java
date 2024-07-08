package ashokIT;


//https://www.youtube.com/watch?v=le0rqTv6IiE
public interface Test {
	
	
	public void display();
	
	//STATIC method //
	public static void m1() {
	   System.out.println("Static method :INTERFACE");
	   throw new RuntimeException("test");
		
	}
	
	//null Check 
	
	public static boolean nullCheck(Object obj) {
		
		
		
		
		return (obj==null);
	}
	
	default public void m2() {
		
		System.out.println("Default method: INTERFACE");
		
	}
	
	

}
