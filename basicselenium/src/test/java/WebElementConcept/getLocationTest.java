package WebElementConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getLocationTest {
	@Test
	public void getLocationTest() {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.pantaloons.com");
		
		
		Point image = d.findElement(By.cssSelector("img[alt='ABG Brand Logo']")).getLocation();
		System.out.println(image.getX());
		System.out.println(image.getY());
		

		Point image1 = d.findElement(By.cssSelector("img[alt='logoIcon']")).getLocation();
		System.out.println(image1.getX());
		System.out.println(image1.getY());
		
		
	}
	
	}


