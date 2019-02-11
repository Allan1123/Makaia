package project;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.selenium.WebDriverServiceImpl;

public class Flipcart extends WebDriverServiceImpl{
	@Test
	public void Flipcart() throws InterruptedException {
		
		ActionEscape();
		WebElement eleTv = locateElement("xpath", "//li/a[@title='TVs & Appliances']/span");
		
		ActionsMouseOver(eleTv);
		
		
		
		WebElement eleSamsung = locateElement("xpath", "(//li/a[@title='Samsung']/span)[2]");
		click(eleSamsung);
		
		WebElement eleMinVal = locateElement("xpath", "(//div/select[@class='fPjUPw'])[1]");
		selectDropDownUsingValue(eleMinVal, "₹25000");
		
		
		WebElement eleMaxVal = locateElement("xpath", "(//div/select[@class='fPjUPw'])[2]");
		selectDropDownUsingValue(eleMaxVal, "₹60000");
		
		WebElement eleScreenSize = locateElement("xpath", "//div[text()='Screen Size']");
		click(eleScreenSize);
		
		
		WebElement eleCheck48 = locateElement("xpath", "(//div[@class='_1p7h2j'])[10]");
		click(eleCheck48);
		
		WebElement elePrice1 = locateElement("xpath", "(//div[@class='_1vC4OE _2rQ-NK'])[1]");
		String priceT = getText(elePrice1);
		
		Thread.sleep(3000);
		
		WebElement eleSamsungProd = locateElement("xpath", "(//div[@class='col col-7-12']/div)[1]");
		click(eleSamsungProd);
		
		switchToWindow(1);
		
		WebElement elePrice = locateElement("xpath", "//div[@class='_1vC4OE _3qQ9m1']");
		
		verifyExactText(elePrice, priceT);
		
		closeActiveBrowser();
		
		switchToWindow(0);
		
		WebElement eleAddtoCompare = locateElement("xpath", "(//div[@class='_1p7h2j'])[18]");
		click(eleAddtoCompare);
		
		
		WebElement eleAddtoCompare1 = locateElement("xpath", "(//div[@class='_1p7h2j'])[19]");
		click(eleAddtoCompare1);
		
		WebElement eleCompare = locateElement("xpath", "//a[@class='_1h5zc_ sTOdGz']");
		click(eleCompare);
		
		WebElement eleCompareT = locateElement("xpath", "(//div[@class='_3wM930']/span)[1]");
		verifyExactText(eleCompareT, "Compare");
		
		
		WebElement eleFirstCompare1 = locateElement("xpath", "(//div[@class='_1vC4OE'])[1]");
		String Compare1 = getText(eleFirstCompare1);
		WebElement eleFirstCompare2 = locateElement("xpath", "(//div[@class='_1vC4OE'])[2]");
		String Compare2 = getText(eleFirstCompare2);
		
		ComparetwoNumbersMin(Compare1,Compare2);
		
		
	}
}
