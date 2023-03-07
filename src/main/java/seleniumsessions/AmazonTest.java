package seleniumsessions;

public class AmazonTest {

	public static void main(String[] args) {

		String browserName = "chrome";

		BrowserUtil brUtil = new BrowserUtil();		
		
		
		brUtil.initDriver(browserName);

		brUtil.launchURL("https://www.amazon.com");

		String actTitle = brUtil.getPageTitle();
		if (actTitle.contains("Amazon")) {
			System.out.println("title -- pass");
		} else {
			System.out.println("title -- fail");
		}

		String actUrl = brUtil.getPageURL();
		if (actUrl.contains("amazon")) {
			System.out.println("url -- pass");
		} else {
			System.out.println("url -- fail");
		}

		brUtil.quitBrowser();

	}

}