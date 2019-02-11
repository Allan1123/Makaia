package project;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKartList {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ESCAPE).perform();
		List allist=driver.findElements(By.tagName("link"));
		int size = allist.size();
		System.out.println(size);
		
	}

}
