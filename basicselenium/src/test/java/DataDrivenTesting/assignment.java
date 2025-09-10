package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class assignment {
	
	@Test
	public void assignment() throws IOException
	{
		FileInputStream fis = new FileInputStream("‪‪C:\\Users\\User\\Desktop\\demowebshopapp.xlxs");
		Workbook wb= WorkbookFactory.create(fis);
		
		//String gender = wb.getSheet("sheet").getRow(1).getCell(1).getStringCellValue();
		//System.out.println(gender);
		
		String firstname = wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(firstname);
		
		String lastname = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(lastname);
		
		String email = wb.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		System.out.println(email);
		
		String password = wb.getSheet("Sheet1").getRow(3).getCell(1).getStringCellValue();
		System.out.println(password);
		
		String confirmpassword = wb.getSheet("Sheet1").getRow(4).getCell(1).getStringCellValue();
		System.out.println(confirmpassword);
		
		Date d1=new Date();
		String timedate=d1.toString().replace(':', '-');
		

		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/register");
		//driver.findElement(By.name("Gender")).sendKeys("gender");
		driver.findElement(By.name("First name")).sendKeys("firstname");
		driver.findElement(By.name("Last name")).sendKeys("lastname");
		driver.findElement(By.name("Email")).sendKeys("email");
		driver.findElement(By.name("Password")).sendKeys("password");
		driver.findElement(By.name("Confirm password")).sendKeys("comfirmpassword");
		
		driver.findElement(By.xpath("//div[contains(@class,'page registration-page')]"));
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File filedestination=new File("./Screenshot2/RegisterPageSS"+timedate+".png");
		FileUtils.copyFile(temp, filedestination);
		driver.close();
		
		
	}

}
