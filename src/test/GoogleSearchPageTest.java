package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.GoogleSearchPageObject;



public class GoogleSearchPageTest {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		
		googleSearchTest ();

	}
	
	public static void googleSearchTest() {
		System.setProperty("webdriver.chrome.driver", "/Users/milinpatel/Downloads/chromedriver");

		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		GoogleSearchPageObject obj = new GoogleSearchPageObject(driver);
		
		obj.setTextInSearchBox("abcdpokmkjnbb");
		obj.clickOnSearchButoon();
		
		
		
		driver.close();

		
	}

}
