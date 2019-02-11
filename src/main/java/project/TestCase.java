package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import lib.selenium.WebDriverServiceImpl;

public class TestCase extends WebDriverServiceImpl{
	@Test
	public void testCase() throws InterruptedException {
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");
		
		WebElement elePassword = locateElement("id", "password");
		type(elePassword, "crmsfa");
		
		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);
		
		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);
		
		WebElement eleAccounts = locateElement("link", "Accounts");
		click(eleAccounts);
		
		WebElement eleCreateAccount = locateElement("link", "Create Account");
		click(eleCreateAccount);
		
		WebElement eleAccountName = locateElement("id", "accountName");
		type(eleAccountName, "Allan8");
		
		WebElement eleIndustry = locateElement("xpath", "//select[@name='industryEnumId']");
		
		selectDropDownUsingValue(eleIndustry, "Aerospace");
		
		WebElement eleCurrency = locateElement("id", "currencyUomId");
		
		selectDropDownUsingValue(eleCurrency, "INR - Indian Rupee");
		
		WebElement eleSource = locateElement("id", "dataSourceId");
		
		selectDropDownUsingValue(eleSource, "Cold Call");
		
		WebElement eleMarketingCamp = locateElement("id", "marketingCampaignId");
		
		selectDropDownUsingValue(eleMarketingCamp, "Automobile");
		
		WebElement elePhoneNumber = locateElement("id", "primaryPhoneNumber");
		type(elePhoneNumber, "9884516877");
		
		WebElement eleCity = locateElement("id", "generalCity");
		type(eleCity, "Chennai");
		
		WebElement eleEmail = locateElement("id", "primaryEmail");
		type(eleEmail, "allandavid35@gmail.com");
		
		WebElement eleCountry = locateElement("id", "generalCountryGeoId");
		selectDropDownUsingValue(eleCountry, "India");
		
		WebElement eleState = locateElement("id", "generalStateProvinceGeoId");
		selectDropDownUsingValue(eleState, "TAMILNADU");
		
		
		WebElement eleButton = locateElement("class", "smallSubmit");
		click(eleButton);
		
		Thread.sleep(3000);
		
		WebElement eleName = locateElement("xpath", "(//span[@class='tabletext'])[3]");
		String leadId = getText(eleName);
		
		leadId = leadId.replaceAll("\\D", "");//Not Number - Non digits
		System.out.println(leadId);
		
		
		WebElement eleFindAccount = locateElement("link", "Find Accounts");
		click(eleFindAccount);
		
		WebElement eleAccountNameF = locateElement("xpath", "(//input[@name='accountName'])[2]");
		type(eleAccountNameF, "Allan");
		
		WebElement eleFindAccBtn = locateElement("xpath", "//button[text()='Find Accounts']");
		click(eleFindAccBtn);
		
		WebElement eleVerify = locateElement("xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-groupName']/a)[1]");
		
		WebDriverWait wc=new WebDriverWait(driver, 10);
		wc.until(ExpectedConditions.textToBe(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-groupName']/a)[1]"), "Allan"));
		String text = eleVerify.getText();
		
		System.out.println(text);
		
		verifyExactText(eleVerify, "Allan");
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
