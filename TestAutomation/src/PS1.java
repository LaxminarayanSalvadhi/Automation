import org.testng.annotations.Test;

public class PS1 extends PS {
	
	@Test
	public void testRun() {
		//System.out.println("Hello");
		PS2 ps2=new PS2(4);
		System.out.println(ps2.increement());
	}

}
