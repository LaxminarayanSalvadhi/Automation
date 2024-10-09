package Automation;

import java.sql.Time;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelenmAuto {
	
	
	public void submitform(WebDriver driver) throws InterruptedException {
		
		//WebDriver wait1= (WebDriver) new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement firstname=driver.findElement(By.xpath("//*[@name='firstName']"));
		firstname.sendKeys("Laxmi");
		
		WebElement lastname=driver.findElement(By.xpath("//*[@name='lastName']"));
		lastname.sendKeys("Salvadhi");
		
		WebElement phone=driver.findElement(By.xpath("//*[@name='phone']"));
		phone.sendKeys("836909919");
		
		WebElement email=driver.findElement(By.xpath("//*[@name='userName']"));
		email.sendKeys("Laxmi");
		
		WebElement address=driver.findElement(By.xpath("//*[@name='address1']"));
		address.sendKeys("100 walter st");
		
		
		WebElement city=driver.findElement(By.xpath("//*[@name='city']"));
		city.sendKeys("Mumbai");
		
		WebElement state=driver.findElement(By.xpath("//*[@name='state']"));
		state.sendKeys("MH");
		
		WebElement postalCode=driver.findElement(By.xpath("//*[@name='postalCode']"));
		postalCode.sendKeys("40009");
		
		WebElement Selectdropdown=driver.findElement(By.xpath("//*[@name='country']"));
		
		Select A1= new Select(Selectdropdown);
		Thread.sleep(5000);
		A1.selectByIndex(10);
		Thread.sleep(5000);
		A1.selectByVisibleText("");
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","E:\\Personal Data\\Swamy\\chromedriver-win64\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		String url="https://demo.guru99.com/test/newtours/register.php";
		driver.get(url);	
		System.out.println(driver.getTitle());
		SelenmAuto a1= new SelenmAuto();
		a1.submitform(driver);
	
	
	
	
	//driver.quit();
	}

}
