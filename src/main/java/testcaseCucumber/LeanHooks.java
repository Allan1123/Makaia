package testcaseCucumber;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import lib.selenium.WebDriverServiceImpl;

public class LeanHooks extends WebDriverServiceImpl {
	@Before

	public void beforeScenario(Scenario sc) {
		startReport();
		startTestCase(sc.getName(), sc.getId());
		startTestModule("Create Lead");
		test.assignAuthor("Allan");
		test.assignCategory("Smoke");


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		webdriver = new ChromeDriver();
		driver = new EventFiringWebDriver(webdriver);
		driver.register(this);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		type(locateElement("id", "username"), "Demosalesmanager");	
		type(locateElement("id", "password"), "crmsfa");
		click(locateElement("class", "decorativeSubmit"));
		click(locateElement("link", "CRM/SFA"));



	}
	public void afterScenario(Scenario sc) {
		closeActiveBrowser();
		endResult();


	}

}
