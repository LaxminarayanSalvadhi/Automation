package CoreJava;

public class TestSuperChild extends TestSuperParent{
	
	String name="ChildString";
	int a=10;
	
	public void getSum() {
		int a=15;
		int b=a + this.a;
		System.out.println("Sm of a is" + b);
	}

	public void getdata() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void getDataString() {
		super.getDataString();
		System.out.println("Child class method");
	}
	
	public TestSuperChild() {
		super();
		System.out.println("Child class Constructor");
	}

	
	public static void main(String[] args) {
		
		TestSuperChild cd= new TestSuperChild();
		cd.getDataString();
		//cd.getSum();
				
	}

}
