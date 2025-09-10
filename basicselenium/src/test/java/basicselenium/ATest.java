package basicselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ATest {
	@Test
	public void myntraTest() {
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/");
	}
	
	}

