package actionDisable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ActionDisable {
	@Test
	public void oracle()
	{
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.get("https://www.oracle.com/java/technologies/javase-jdk24-doc-downloads.html");
		
		d.findElement(By.linkText("jdk-24.0.2_doc-all.zip")).click();
		
		WebElement disabled_download_btn = d.findElement(By.linkText("Download jdk-24.0.2_doc-all.scriptzip"));
		
		JavascriptExecutor jse=(JavascriptExecutor)d;
		jse.executeScript("arguments[0].click()",disabled_download_btn);
	}

}
