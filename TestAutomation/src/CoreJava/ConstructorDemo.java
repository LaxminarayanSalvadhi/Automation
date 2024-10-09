package CoreJava;

public class ConstructorDemo {
	
	public ConstructorDemo()
	{
		System.out.println("This is constructor");
	}
	
	public ConstructorDemo(int a,int b)
	{
		System.out.println("This is paramterized "+a+" , "+b);
	}

	
	public void getdata()
	{
		System.out.println("This is getData Method");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo cd=new ConstructorDemo(100,200);

	}

}
