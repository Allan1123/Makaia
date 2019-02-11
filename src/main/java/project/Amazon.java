package project;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.selenium.WebDriverServiceImpl;

public class Amazon extends WebDriverServiceImpl{
		@Test
		public void Amazon() throws InterruptedException {
			
			WebElement eleSignIn = locateElement("xpath", "(//a[@class='nav-a nav-a-2'])[2]");
			ActionsMouseOver(eleSignIn);
			
			Thread.sleep(3000);
			
			WebElement eleSignInBtn = locateElement("xpath", "(//span[text()='Sign in'])[1]");
			click(eleSignInBtn);
			
			Thread.sleep(10000);
			
			WebElement eleLogin = locateElement("xpath", "//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']");
			type(eleSignIn, "allandavid35@gmail.com");
			
			
			
			
			
		}

	}


