package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testpara {
	WebDriver driver;
	@BeforeMethod
	  public void start() {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\training\\Desktop\\sele\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://connect.maveric-systems.com/index.php/site/login");
	}

	@Test
	@Parameters({"sUsername","sPassword"})
	public void test(String sUsername,String sPassword) {

	 driver.findElement(By.xpath("//*[@id=\"LoginForm_username\"]")).sendKeys(sUsername);
	 driver.findElement(By.xpath("//*[@id=\"LoginForm_password\"]")).sendKeys(sPassword);
	 driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/input")).click();
	}


}
