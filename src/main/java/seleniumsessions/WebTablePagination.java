package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTablePagination {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(6000);
		
		//single selection:
		while(true) {
			//single selection:
			//ele is on the first page itself
			//
			if(driver.findElements(By.xpath("//td[text()='Russia']")).size() > 0) {
				selectCountry("Russia");
				break;
			}
			else {
				//pagination logic:
				WebElement next = driver.findElement(By.linkText("Next"));
					
					if(next.getAttribute("class").contains("disabled")) {
						System.out.println("pagination is over...country is not found....");
						break;
					}
				
				next.click();
				Thread.sleep(3000);
			}
			
		}
		
	}

	private static void selectCountry(String countryName) {

		driver.findElement(By.xpath("//td[text()='"+countryName+"']/preceding-sibling::td/input[@type='checkbox']")).click();
		
		
	}

}