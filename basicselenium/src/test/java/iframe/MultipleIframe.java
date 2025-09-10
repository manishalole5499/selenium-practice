package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleIframe {
	
	@Test
	
	public void Demosite() {
		
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://demo.automationtesting.in/Frames.html");
		
		//d.switchto().frame(0);
		d.switchTo().frame("singleframe");
		d.findElement(By.xpath("input[type='text']")).sendKeys("manisha");
		
		//taking the screenshot of iframe only
	
		
		
		//switch to main page
		d.switchTo().defaultContent();
		
		d.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		
		//switch to outer frame
		WebElement OuterFrame = d.findElement(By.xpath("//iframe[@src='MultipleFrame.html']"));
		d.switchTo().frame(OuterFrame);
		
		//switch to inner frame
		WebElement InnerFrame = d.findElement(By.xpath("//iframe[@src='SingleFrames.html']"));
		d.switchTo().frame(InnerFrame);
		
		//switch to inner frame
		WebElement nestedinput = d.findElement(By.xpath("//input[@type='text']"));
		d.switchTo().frame(nestedinput);
		
		d.switchTo().defaultContent();
	
	}

}
