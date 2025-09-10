package WebElementConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getTextTest
{
@Test
public void getTextTest() throws InterruptedException
{
	WebDriver d=new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://demo.vtiger.com/vtigercrm/");
 
Thread.sleep(2000);
String element=d.findElement(By.xpath("//p[text()='Forgot Your Password? ']")).getText();
System.out.println(element);
String link=d.findElement(By.linkText("orangeHRM, Inc")).getText();
System.out.println(link);

String Username= d.findElement(By.name("username")).getText();
System.out.println(Username);

}
	
}


