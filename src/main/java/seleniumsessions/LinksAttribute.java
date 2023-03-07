package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAttribute {

	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
//		List<WebElement> linksList=driver.findElements(By.tagName("a"));
//		System.out.println("Total links"+linksList.size());
//		
//		for(WebElement e:linksList)
//		{
//			String text=e.getText();
//			String attribute=e.getAttribute("href");
//			
//			if(text.length()>0)
//			{
//				System.out.println(attribute+"-->"+text);
//			}
//		}
		
//		List<WebElement> imglist=driver.findElements(By.tagName("img"));
//		System.out.println(imglist.size());
//		
//		for(WebElement e:imglist)
//		{
//			String srcVal=e.getAttribute("src");
//			System.out.println(srcVal);
//		}
		
		By images=By.tagName("img");
		By links=By.tagName("a");
		
		
		getElementAttribute(images, "src");
		getElementAttribute(links, "href");
	}
	
	public static List<WebElement> getElements(By Locator)
	{
		return driver.findElements(Locator);
	}
	public static void getElementAttribute(By locator, String attrName)
	{
		List<WebElement> eleList=getElements(locator);
		for(WebElement e:eleList)
		{
			String attrval=e.getAttribute(attrName);
			System.out.println(attrval);
		}
	}
	

}
