package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.GoogleSearchPage;;

public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/milinpatel/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.google.com");
		GoogleSearchPage.textbox_search(driver).sendKeys("ABCD");
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		Thread.sleep(4000);
		driver.close();

	}

}
