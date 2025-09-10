package Screeenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class webPageTest {

	@Test
	public void webPageText() throws IOException, InterruptedException
	{
		Date d=new Date();
		String timedate = d.toString().replace(':', '-');
		    //OR
		
		//String td=new Date().toString().replace(':', '*');
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		//step1:Downcasting
		TakesScreenshot ts= (TakesScreenshot) driver;
		//step2:store screenshot inside temp variable
		File temp = ts.getScreenshotAs(OutputType.FILE);
		//step3:create permanent location
		File destinationfile = new File("./i/pic"+timedate+".png");
		//step4:create a folder and move scrrenshot from temp location to permanent location
		FileUtils.copyFile(temp, destinationfile);
	}
	

}
