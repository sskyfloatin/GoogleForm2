package google;

import java.io.IOException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.GoogleFormPage;
import junit.framework.Assert;

import org.testng.annotations.AfterTest;

import resources.base;

public class GoogleForm extends base {
	
	
	@BeforeTest
	public void initialize() throws IOException, InterruptedException
	{
		driver=InitializeDriver();
		driver.get(prop.getProperty("url"));
		
		
	}
	
	@Test()
	public void shopTest() throws InterruptedException
	{
		
		GoogleFormPage g = new GoogleFormPage(driver);
		
		g.getEmail().sendKeys("1@1.com");
		g.getName().sendKeys("Test-Name");
		g.getDate().click();
		g.getDate().sendKeys("01011999");
		g.getExcellentMood().click();
		
		g.getSubmit().click();
		
		//Verify success screen appears on submit
		Assert.assertTrue(g.getHeading().isDisplayed());
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	

	

}
