package testngConcept;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basicselenium.BaseTest;

public class loginToApplicationTest extends BaseTest {//child class


	@Test(priority=1)
	public void loginToApplicationUsernamePassword() {
		d.findElement(By.xpath("span[text()='Leave']")).click();
		
	}
	
	@Test(priority=2)
	
	public void clickOnPIMTest()
	{
		d.findElement(By.cssSelector("i[class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
	}
	
	@Test (priority=3)
	
	public void clickOnTime()
	{
	d.findElement(By.xpath("//span[text()='Time']")).click();
	}
}
	
	
	


