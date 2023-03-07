package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementAttributeConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		String ph=driver.findElement(By.name("firstname")).getAttribute("placeholder");
//		System.out.println(ph);

//		String src=driver.findElement(By.className("img-responsive")).getAttribute("src");
//		String title=driver.findElement(By.className("img-responsive")).getAttribute("title");
//		System.out.println("src-->"+src);
//		System.out.println("title-->"+title);
//		
		By fn = By.name("firstname");
		By src = By.className("img-responsive");

		String srctext = getAttribute(src, "src");
		String title = getAttribute(src, "title");
		String ph = getAttribute(fn, "placeholder");
		System.out.println("Title-->" + title);
		System.out.println("source text-->" + srctext);
		System.out.println("ph-->" + ph);
	}

	public static WebElement getElelement(By locator) {
		return driver.findElement(locator);
	}

	public static String getAttribute(By locator, String AttributeName) {
		return getElelement(locator).getAttribute(AttributeName);
	}

}
