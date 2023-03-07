package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPageLocators {
	
	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		ElementUtil util= new ElementUtil(driver);
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
	//	By firstname=By.id("input-firstname");  
	//	By firstname1=By.name("firstname");
	//	By firstname2=By.xpath("//*[@id=\"input-firstname\"]");
	//	By firstname3=By.cssSelector("#input-firstname");
//		WebElement link=driver.findElement(By.linkText("Login"));
//		link.click();
//		
//		//	driver.close();
//		
		
		
		
		
		
	}
	public static WebElement getLocator(By locator)
	{
		return driver.findElement(locator);
	}
	public static void doClick(By locator)
	{
		getLocator(locator).click();
	}
	
	public static void doSendKeys(By locators,String value)
	{
		getLocator(locators).sendKeys(value);
	}
	public static String doElementgetText(By locator)
	{
		return getLocator(locator).getText();
	}
}
