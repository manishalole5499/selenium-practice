package WebElementConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getEnableTest {
@Test
public void getEnableTest()
{
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.myntra.com");
	boolean searchtf=d.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).isEnabled();
	System.out.println(searchtf);


}

}
