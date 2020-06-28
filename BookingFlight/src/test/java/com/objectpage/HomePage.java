package com.objectpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);

	}

	@FindBy(name = "userName")
	WebElement editUsername;

	public void enterUsername(String username) {
		editUsername.sendKeys(username);
	}

	@FindBy(xpath = "//input[@name='password']")
	WebElement editPassword;

	public void enterpassword(String password) {
		editPassword.sendKeys(password);
	}

	@FindBy(name = "login")
	WebElement clicksubmit;

	public void submitbuttom() {
		clicksubmit.click();

	}

}
