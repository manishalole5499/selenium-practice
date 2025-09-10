package testngConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class applicationBrowserTest1 {
	@Test
	
	public void tira()
	{
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.tirabeauty.com/");
	}

}
