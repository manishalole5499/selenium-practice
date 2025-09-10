package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Promptpopup {
	@Test
	public void Popup1()
	{
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		d.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	
		d.switchTo().alert().sendKeys("Manisha");
		d.switchTo().alert().accept();
	
	}
}
