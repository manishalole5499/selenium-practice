package WebElementConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getRect {
	@Test
	public void getRect() {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.pantaloons.com");
		
		Rectangle image=d.findElement(By.cssSelector("img[alt='ABG Brand Logo'")).getRect();
		System.out.println(image.getX());
		System.out.println(image.getY());
		System.out.println(image.getHeight());
		System.out.println(image.getWidth());
		
	}

}
