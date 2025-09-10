package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IframePractice {
	@Test
	
	public void netify()
	{
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://qa-automation-practice.netlify.app/iframe");
		//d.switchto().frame(0);
		
		//using name or id
		d.switchTo().frame("iframe-checkboxes");
		
		
		
		//creating webelement
		WebElement iframe = d.findElement(By.xpath("//h1[text()='Hello, this is an Iframe!']"));
		System.out.println(iframe.getText());
		
		
		WebElement heading_text = d.findElement(By.xpath("//h1[text()='Hello, this is an Iframe!']"));
		System.out.println(heading_text.getText());
		
		WebElement paragraph_text = d.findElement(By.xpath("//p[contains(text(),'This is a simple hero unit, a simple jumbotron-style component for calling extra attention to featured content or information.')]"));
		System.out.println(paragraph_text.getText());
		
		
		//switching the control back to the parent
		d.switchTo().parentFrame();
		
		//outside the frame
		WebElement main_text = d.findElement(By.xpath("//h2[text()='Iframe Example']"));
		System.out.println(main_text.getText());
		
		
		
		
		
				
	}

}
