package actionDisable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ActionOnHiddenElement {
	@Test
	public void Hidden()
	{
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.facebook.com/");
		
		d.findElement(By.xpath("//a[text()='Create new account']")).click();
		//d.findElement(By.xpath("//label[text()='Custom']")).click();
		
		WebElement Hidden_fields = d.findElement(By.id("custom_gender"));
		
		JavascriptExecutor jse=(JavascriptExecutor)d;
		jse.executeScript("arguments[0],value='gender sent by js'",Hidden_fields);
		
	}

}
