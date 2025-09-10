package testngConcept;

import org.testng.annotations.Test;

public class applicationTest {
	
@Test(groups="Ecommerce")
public void Amazon()
{
System.out.println("Amazon");
}

@Test(groups="Ecommerce")
public void Flipkart()
{
	System.out.println("Flipkart");
	}


@Test
public void Swiggy()
{
	System.out.println("Swiggy");
	}


@Test(groups="Ecommerce")
public void Myntra()
{
	System.out.println("Myntra");
	}
}
