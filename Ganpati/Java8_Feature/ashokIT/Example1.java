package ashokIT;

import java.util.Collections;

public class Example1 implements Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Test.super.display();
		
		Example1 ex= new Example1();
		ex.method1();

	}
	
	public void method1() {
		
		Test.super.m2();
	}
	

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println("EXAMPLE1 :display ");
		
		Collections.sort(null);
		
		
		
		

}
}