package CoreJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Date d1= new Date();
		
		SimpleDateFormat sdf=new SimpleDateFormat("mm/dd/yyyy");
		SimpleDateFormat sdf1=new SimpleDateFormat("mm/dd/yyyy hh:mm:ss");
		System.out.println(d1.toString());
		System.out.println(sdf.format(d1));
		System.out.println(sdf1.format(d1));
		
	}

}
