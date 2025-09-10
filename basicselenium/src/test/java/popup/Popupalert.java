package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Popupalert {
	@Test
	
	public void demowebshop() 
	{
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://demowebshop.tricentis.com/login");
		
		d.findElement(By.cssSelector("input[class='button-1 search-box-button']")).click();
		d.switchTo().alert().accept();
	
	}


	
	@Test
	public void ConfirmationPopup()
	{
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://demo.guru99.com/");
		
		d.findElement(By.cssSelector("input[type='submit']")).click();
		d.switchTo().alert().accept();
	}
	
	
	}

	
	


