package CoreJava;

public class Childvehicle extends ParentVehicle {
	
	public void colour() {
		System.out.println("Child class"+color);
	}
	
	public void tires(int a) {
		System.out.println(a);
	}
	
	public void tires(int a, String b) {
		System.out.print(a+b);
	}
	
	
	String color="blue";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentVehicle c1=new ParentVehicle();
		c1.audiosystem();
		c1.brakes();
		c1.colour();
		Childvehicle c2= new Childvehicle();
		c2.colour();
	//	System.out.println(c1.color);
		//System.out.println(c2.color);
		
	//	Childvehicle c1= new Childvehicle();
//		c1.tires(100);
	//	c1.tires(10, "Hello");
	}

}
