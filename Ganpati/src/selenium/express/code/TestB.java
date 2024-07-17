package selenium.express.code;


class TestA{
	
	int x= 10;
	
	public void methodA() {
		
		System.out.println("Value of x in A: "+x);
	}
}


public class TestB extends TestA{

	int x= 23;// variable Hiding //
	
	public void methodB() {
		
		System.out.println("Value of x in B: "+x);
		
	}
	public static void main(String[] args) {
		
		
		TestB bb= new TestB();
		
	    bb.methodB();
	    
	    bb.methodA();
	TestA aa= new TestB();///Parent class Reference : child class object 
	
	
	aa.methodA();
	
	
		

	}
	

}
