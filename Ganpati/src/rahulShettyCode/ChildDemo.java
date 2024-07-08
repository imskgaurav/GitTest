package rahulShettyCode;

public class ChildDemo extends ParentDemo {
	
	
	String name="JavaNameQA";
	
	public void displayName() {
		
		System.out.println("Child class Name Method");
		
		System.out.println("Name is :"+name);
		System.out.println("Calling Parent Var with Super keyword");
		System.out.println(super.name);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Parent Class reference will call Parent Variable;
		
		ParentDemo pd = new ParentDemo();
		
		System.out.println(pd.name);
		
		pd.displayName();
		
		System.out.println("CHILD CLASS obj WITH parent References");
		ParentDemo pp= new ChildDemo();
		
		System.out.println(pp.name);
		
		//Parent class variable with object of Child class : 
		///method is overridden in child class .So child class method is called
		
		pp.displayName();
		
		//Child Class Reference
		
		System.out.println("Child class Obj with Child class Reference");
		
		ChildDemo cc= new ChildDemo();

		
	    System.out.println(cc.name);
		
		
	   cc.displayName();
	   
	 
	}

}
