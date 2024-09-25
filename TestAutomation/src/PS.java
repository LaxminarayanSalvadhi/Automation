import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class PS {
	
	@BeforeMethod
	public void method1() {
		System.out.println("Before Test Method");
	}
	
	@AfterMethod
	public void method2() {
		System.out.println("Before Test Method");
	}

}
