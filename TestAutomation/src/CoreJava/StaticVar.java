package CoreJava;

public class StaticVar {
	
	String name;
	String address;
	static String city;
	static int i;
	static {
		i=0;
		city="mumbai";
	}
	
	StaticVar(String name,String address){
		this.name=name;
		this.address=address;
		i++;
		System.out.println(i);
		
	}
	
	public void getAddress()
	{
		System.out.println(address+" "+city);
	}

	public static void getcity() 
	{
		System.out.println(city);
	}
	
	
	public static void main(String[] args) 
	{
		StaticVar obj= new StaticVar("LX","Tilaknagar");
		StaticVar obj1= new StaticVar("Swamy","Chembur");
		obj.getAddress();
		obj1.getAddress();
		StaticVar.getcity();
	}

}
