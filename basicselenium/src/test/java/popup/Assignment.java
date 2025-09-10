package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment {
	@Test
	public void naukri()
	{
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		
        d.findElement(By.id("Full name")).sendKeys("Manisha lole")
		d.findElement(By.id("Email Id")).sendKeys("manisha@54lole");
		d.findElement(By.id("Password")).sendKeys("Manu@1234");
		d.findElement(By.id("Mobile Number")).sendKeys(1234567890);
		
		d.findElement(By.xpath("//p[contain(text(),'  I have work experience (excluding internships)')]")).click();
		d.findElement(By.id("resumeupload")).sendKeys("‪C:\\Users\\User\\Documents\\Custom Office Templates");//paste here pdf link
		
		
		
	}

}
