package findElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class FindElements {
@Test
public void redbus()
{
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get("https://www.redbus.in/");
	
	
	List<WebElement> links =  d.findElements(By.tagName("@"));
	System.out.println("Total no of links in this site:"+links.size());
	for(WebElement link:links)
	{
	String link_name = link.getText();
	String link_value = link.getAttribute("href");
	System.out.println(link_name+"-->"+link_value);
	}
}
}
