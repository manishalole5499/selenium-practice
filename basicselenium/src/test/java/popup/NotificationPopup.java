package popup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class NotificationPopup {
	@Test
	
	public void popup() {
		
		ChromeOptions options=new ChromeOptions();
		 //options.addArguments("--disable notification");
		options.addArguments("--incognito");
		
	
	WebDriver d = new ChromeDriver(options);
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	d.get("https://www.yatra.com/");
	
	}
}
