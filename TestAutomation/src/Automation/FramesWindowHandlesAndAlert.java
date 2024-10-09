package Automation;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramesWindowHandlesAndAlert {
	
	public void AlertTest(WebDriver driver) {
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String alertMessage = "";
        driver.get("http://jsbin.com/usidix/1");
        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
        alertMessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();
        System.out.println(alertMessage);
		
	}
	
	public void Windowhandlestest(WebDriver driver) throws InterruptedException {
		
		//Launching the site.				
        driver.get("https://demo.guru99.com/popup.php");			
        Thread.sleep(1000);
        driver.manage().window().maximize();		
        Thread.sleep(5000);	
        driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();			
        Thread.sleep(1000);
        String MainWindow=driver.getWindowHandle();		
    		
    // To handle all new opened window.				
        Set<String> s1=driver.getWindowHandles();		
        	Iterator<String> i1=s1.iterator();		
    		
    while(i1.hasNext())			
    {		
        String ChildWindow=i1.next();		
        		
        if(!MainWindow.equalsIgnoreCase(ChildWindow))			
        {    		
             
                // Switching to Child window
                driver.switchTo().window(ChildWindow);	
                Thread.sleep(2000);
                driver.findElement(By.name("emailid"))
                .sendKeys("gaurav.3n@gmail.com");                			
                
                driver.findElement(By.name("btnLogin")).click();			
                      System.out.println("Child window");       
		// Closing the Child Window.
                    driver.close();		
        }		
    }		
    // Switching to Parent window i.e Main Window.
        driver.switchTo().window(MainWindow);	
        System.out.println("Parent window");    
}


	public void Frametest(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/selenium/deprecated.html");
        driver.switchTo().frame("classFrame");
        driver.findElement(By.linkText("Deprecated")).click();
        driver.close();
	}
	
	public void Actionstest(WebDriver driver) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		String baseUrl = "http://demo.guru99.com/test/newtours/";	
				driver.get(baseUrl);           
                Thread.sleep(5000);
				WebElement link_Home = driver.findElement(By.linkText("Home"));
                WebElement td_Home = driver
                        .findElement(By
                        .xpath("//html/body/div"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr/td"
                        + "/table/tbody/tr"));
                Thread.sleep(5000);
                Actions builder = new Actions(driver);
                Action mouseOverHome = builder
                        .moveToElement(link_Home)
                        .build();
                Thread.sleep(5000);
                String bgColor = td_Home.getCssValue("background-color");
                System.out.println("Before hover: " + bgColor);        
                mouseOverHome.perform();        
                bgColor = td_Home.getCssValue("background-color");
                System.out.println("After hover: " + bgColor);       
	}
	
public void Actionstest2(WebDriver driver) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		
		String baseUrl = "http://www.facebook.com/";	
				driver.get(baseUrl);           
                Thread.sleep(5000);
                WebElement txtUsername = driver.findElement(By.id("email"));
                Actions builder = new Actions(driver);
                Thread.sleep(1000);
                Action seriesOfActions = builder
                	.moveToElement(txtUsername)
                	.click()
                	.keyDown(txtUsername, Keys.SHIFT)
                	.sendKeys(txtUsername, "hello")
                	.keyUp(txtUsername, Keys.SHIFT)
                	.doubleClick(txtUsername)
                	.contextClick()
                	.build();
                	
                seriesOfActions.perform() ;       
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method 
		System.setProperty("webDriver.chrome.driver","E:\\Personal Data\\Swamy\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		FramesWindowHandlesAndAlert obj= new FramesWindowHandlesAndAlert();
	//	obj.AlertTest(driver);
		//obj.Frametest(driver);
       // obj.Actionstest2(driver);
        obj.Windowhandlestest(driver);
        driver.quit();
        System.out.print("Hello");	}

}
