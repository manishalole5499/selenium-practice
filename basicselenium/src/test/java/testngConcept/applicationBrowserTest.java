package testngConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class applicationBrowserTest {
	
	
	@Test(groups="Ecommerce")
	public void Amazon()
	{
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
	}

	@Test(groups="Ecommerce")
	public void Flipkart()
	{
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.flipkart.com/");
		}


	@Test
	public void Swiggy()
	{
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.swiggy.com/");
		}


	@Test(groups="Ecommerce")
	public void Myntra()
	{
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.myntra.com/");
		}

}
