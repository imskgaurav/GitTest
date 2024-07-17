package selenium.express.code;


//static block , instant Block , constructor, method1

public class Test {
	
	
	
	public void method1() {
		
		System.out.println("Method1 ");
	}
	
	Test(){
		
		System.out.println("Construtor called");
	}
	
	//instant block 
	
	{
	
		System.out.println("Instance Block called ");
	}
	
	static {
		
		System.out.println("Static Blocked Called");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
    System.out.println("Main method print statement");
    
    new Test().method1();
	}

}
