package testngConcept;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeTest {
	@Test
	
	public void createAccountTest()
	{
		System.out.println("create account");
		Assert.assertEquals("Pune", "hadapsar");
	}
	
	@Test(dependsOnMethods="createAccountTest")
	public void deleteAccountTest()
	{
		System.out.println("delete account");
		
	}
	
	@Test
	
	public void modifyAccountTest()
	{
		System.out.println("modify account");
	}

}
