import CoreJava.CentralTraffic;

public class AustralianTraffic implements CentralTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic a= new AustralianTraffic();
		a.greengo();
		
	}

	@Override
	public void greengo() {
		// TODO Auto-generated method stub
		System.out.println("Green Go");
	}
	
	@Override
	public void redstop() {
		// TODO Auto-generated method stub
		System.out.println("Red stop");
		
	}

	@Override
	public void flashyellow() {
		// TODO Auto-generated method stub
		System.out.println("Yellow wait");
	}

}
