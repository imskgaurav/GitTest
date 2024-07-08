package inheritance;

public class ChildCC extends ParentAA {
	public void childClass() {

		System.out.println("Child class method");
	}



	public static void main(String[] args) {

		//Parent Class : Parent class Object //

		ParentAA p = new ParentAA();

		p.parentMethod();



		//Parent class Reference : Child class object//

		ParentAA pp = new ChildCC();

		pp.parentMethod();



		// Conclusion :U cannot call Child class method from parent class reference;


		//From child classs Ref u cannot create Parent object;

		//ChildCC c = new ParentAA();

		// From child class Reference  with Child class Object //u can call  parent And child class method:

		ChildCC cc = new ChildCC();

		cc.parentMethod();

		cc.childClass();



	}

}
