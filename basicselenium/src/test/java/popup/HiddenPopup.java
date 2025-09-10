package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HiddenPopup {
	@Test
	
	public void popup()
	{
		
		//ChromeOptions options=new ChromeOptions();
		
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.makemytrip.com/");
		
		try
		{
			d.findElement(By.xpath("//span[@class='comonhlodal_close\"]")).click();
			d.findElement(By.xpath("//span[@class='comonhlodal_close\"]")).click();
			d.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
			
		}
		
		catch(Exception e)
		{
		System.out.println("popup handled");	
		}
		
		d.findElement(By.xpath("//span[@class='comonhlodal_close\"]")).click();
		d.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
		for(;;)
			try
		{
				d.findElement(By.xpath("//div[@aria-label='Thu Dec 25 2025']")).click();
		}
		catch(Exception e)
		{
			d.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		
		}
		
	}

}


