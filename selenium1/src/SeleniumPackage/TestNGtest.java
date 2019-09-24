package SeleniumPackage;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TestNGtest {
	WebDriver driver;
	String s1= "http://localhost:5566/wd/hub";
	
	@BeforeTest
	public void loin() throws MalformedURLException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training\\Desktop\\sele\\chromedriver.exe");
		
		//driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://connect.maveric-systems.com/index.php/site/login");

	}


	@AfterTest
	public void entering()
	{
		driver.close();
	}
	@Test
	public void connect() throws InterruptedException
	{
		
		driver.findElement(By.id("LoginForm_username")).sendKeys("roja");
		Thread.sleep(2000);
		driver.findElement(By.id("LoginForm_password")).sendKeys("1234");
		
	}
}
