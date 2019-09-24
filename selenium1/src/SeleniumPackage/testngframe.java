package SeleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class testngframe {
	WebDriver driver;
	@Test//(priority=1)
	//@Parameters({"sUsername","sPassword"})
	public void test() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training\\Desktop\\sele\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://connect.maveric-systems.com/index.php/site/login");

	}
//	@Test//(priority=2)
//	public void test2() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training\\Desktop\\sele\\chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.toolsqa.com/automation-practice-table/");
	}
	

		

