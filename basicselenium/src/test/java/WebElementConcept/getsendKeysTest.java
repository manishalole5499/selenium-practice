package WebElementConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getsendKeysTest {
	private WebElement usertf;

	@Test
	public void getsendKeysTest1()
	{
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.vtiger.com/vtigercrm/");
		WebElement button=d.findElement(By.xpath("//button[text()='Sign in']"));
		//button click();
		//button submit();
		//button sendkeys(Keys.ENTER);
		WebElement usertf=d.findElement(By.id("username"));
		usertf.sendKeys(Keys.CONTROL+"A");
		usertf.sendKeys(Keys.DELETE);
	}
		
		@Test
		public void getsendKeysTest()
		{
			WebDriver d=new ChromeDriver();
			d.manage().window().maximize();
			d.get("https://demo.vtiger.com/vtigercrm/");
		
		WebElement usertf1=d.findElement(By.id("username"));
		usertf.sendKeys(Keys.CONTROL+"A");
		usertf.sendKeys(Keys.CONTROL+"c");
		d.findElement(By.id("password")).sendKeys(Keys.CONTROL+"v");		
				
	}

}
