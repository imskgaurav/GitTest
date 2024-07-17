package selenium.express.code;

public class TestStaticBlock {

	static int x=12;
	static {
		
		
		System.out.println("Static block");
	}
	
	public static void main(String[] args) {
		
		System.out.println(x);
		
	}
}
