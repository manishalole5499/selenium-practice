package WebElementConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElelment_Click
{
	@Test
	public void gettagTest()
	{
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.pantaloons.com");
	//identify searchtf and enter bag
	d.findElement(By.cssSelector(input[placeholder='Search']));
	//click on search icon
	d.findElement(null)
	
	String bag=d.findElement(By cssSelector("*[id='__next']")).getTagName();
	System.out.println(bag);
	
	Dimension image=d.findElement(By cssSelector("img[alt='ABG Brand Logo']")).getSize();
	System.out.println(image);
	
	Dimension icon=d.findElement(By cssSelector("img[alt='logoIcon']")).getSize();
	System.out.println(icon);
	

}
}