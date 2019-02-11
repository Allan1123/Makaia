//package testcaseCucumber;
//
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class CreateLead {
//	public ChromeDriver driver;
//	@Given ("open leaftaps browser")
//	public void OpenBrowser() {
//		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
//		driver= new ChromeDriver();
//		driver.manage().window().fullscreen();
//		driver.get("http://leaftaps.com/opentaps/control/login");
//		
//
//	}
//	@Given ("Enter the user name (.*)")
//	public void UserName(String uName) {
//		driver.findElementById("username").sendKeys(uName);
//	}
//	@And ("Enter the password (.*)")
//	public void PassWord(String uPass) {
//		driver.findElementById("password").sendKeys(uPass);
//	}
//	@And("Click on the login Button")
//	public void LoginBtn() {
//		driver.findElementByClassName("decorativeSubmit").click();
//		driver.findElementByLinkText("CRM/SFA").click();
//	}
//	@And("Click lead link")
//	public void ClickLeadLink() {
//		driver.findElementByLinkText("Leads").click();
//	}
//	
//	@And("Click Create Lead link")
//	public void CreateLeadLink() {
//		driver.findElementByLinkText("Create Lead").click();
//	}
//
//	@And("type companny name (.*)")
//	public void typeCompanyName(String compName) {
//		driver.findElementById("createLeadForm_companyName").sendKeys(compName);
//	}
//	@And("type first name (.*)")
//	public void typeFirstName(String fname) {
//		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
//	}
//
//	@And("type last name (.*)")
//	public void typeLastName(String lname) {
//		driver.findElementById("createLeadForm_lastName").sendKeys(lname);
//	}
//
//	@When("Create Lead")
//	public void clickLeads() {
//		driver.findElementByClassName("smallSubmit").click();
//	}
//
//
//	@Then("Create lead is successful")
//	public void createLeadSuccess() {
//		System.out.println("Create lead is successfull");
//	}
//
//
//}
