package basicselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest { //parent class
	
	public WebDriver d;

	
	@BeforeSuite
	public void BS() //
	{
	}
	
	@BeforeClass
	public void BC()// used to launch the browser
	{
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
	}
	
	@BeforeMethod
	public void BM()//used to login application
	{
		d.findElement(By.name("username")).sendKeys("Admin");
		d.findElement(By.name("password")).sendKeys("admin123");
		d.findElement(By.xpath("//button[text()='Login']")).click();
	}
	
	@AfterMethod
	public void AM()//used to logout application
	{
		d.findElement(By.cssSelector("i[class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		d.findElement(By.linkText("Logout")).click();
		d.findElement(By.xpath("span[text()='Time']")).click();
		
	}
	
	@AfterClass
	public void AC() //used to close the application
	{
		d.quit();
	}
	
	@AfterSuite
	public void AS()
	{
	}
	}
	
	

