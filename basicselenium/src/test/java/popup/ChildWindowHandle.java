package popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChildWindowHandle {
@Test
public void demo()
{
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get("https://demowebshop.tricentis.com/");
	d.findElement(By.linkText("Facebook")).click();
	String parent_id=d.getWindowHandle();
	System.out.println(parent_id);
	Set<String>   allIds=d.getWindowHandles();
	
	System.out.println(allIds);
	allIds.remove(parent_id);
	for(String id:allIds)
	{
		d.switchTo().window(id);
	}
	
}
}
