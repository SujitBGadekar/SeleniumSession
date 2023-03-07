package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElement {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map");
		
		Thread.sleep(9000);
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		
		String svgXpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path']";
		
		List<WebElement> statesList = driver.findElements(By.xpath(svgXpath));
		
		System.out.println(statesList.size());
		
		for(WebElement e : statesList) {
			
			String stateName = e.getAttribute("name");
			System.out.println(stateName);
			
				if(stateName.equals("Maryland")) {
					e.click();
					break;
				}
		}
		
		
	}

	
	//*[local-name()='svg']//*[name()='g' and @fill-rule='evenodd']
	
	
	public static void createUser(String name) {
		String xpath = "//input[contains(text()='"+name+"')]";
		xpath = xpath.replaceAll("name", "name");
	}
	
	
}