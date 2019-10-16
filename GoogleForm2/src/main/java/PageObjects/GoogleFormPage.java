package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleFormPage {
	
	public static WebDriver driver;
	
	By email=By.xpath("//input[@type='email']");
	By name = By.xpath("//input[@name='entry.260210294']");
	By submit = By.xpath("//*[@class='quantumWizButtonPaperbuttonLabel exportLabel']");
	By excellentMood = By.xpath("(//div[@class='quantumWizTogglePapercheckboxInnerBox exportInnerBox'])[1]");
	By date = By.xpath("//input[@type='date']");
	By month = By.xpath("//div[@jsname='XmnwAc'][@style='transform-origin: 12px center;']");
	By heading = By.xpath("//*[@role='heading']");
	
	


	public GoogleFormPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	public WebElement getName()
	{
		return driver.findElement(name);
	}
	public WebElement getSubmit()
	{
		return driver.findElement(submit);
	}
	public WebElement getExcellentMood()
	{
		return driver.findElement(excellentMood);
	}
	public WebElement getDate()
	{
		return driver.findElement(date);
	}
	public WebElement getMonth()
	{
		return driver.findElement(month);
	}
	public WebElement getHeading()
	{
		return driver.findElement(heading);
	}

	
	

	

}
