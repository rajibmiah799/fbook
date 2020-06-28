package com.objectpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class BookingPage extends BasePage {

	public BookingPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "(//input[contains(@name,'tripType')])[1]")
	WebElement edittrip;

	public void clickroundtrip() {
		edittrip.click();
	}

	public void passenger() {

		WebElement editpassenger = driver.findElement(By.xpath("//select[@name='passCount']"));
		Select sel = new Select(editpassenger);
		sel.selectByValue("2");

	}

	@FindBy(xpath = "//select[@name='fromPort']")
	WebElement editdepertfrom;

	public void deAirport() {
		Select sel1 = new Select(editdepertfrom);
		sel1.selectByVisibleText("New York");
	}

	@FindBy(xpath = "//select[@name='fromMonth']")
	WebElement editmonth;

	public void deMonth() {
		Select demonth = new Select(editmonth);
		demonth.selectByVisibleText("March");

	}

	@FindBy(xpath = "//select[contains(@name,'fromDay')]")
	WebElement editdate;

	public void deDate() {
		Select dedate = new Select(editdate);
		dedate.selectByVisibleText("25");

	}

	@FindBy(xpath = "//select[contains(@name,'toPort')]")
	WebElement editarrivein;

	public void arriveAirport() {
		Select arrivein = new Select(editarrivein);
		arrivein.selectByVisibleText("London");

	}

	@FindBy(xpath = "//select[contains(@name,'toMonth')]")
	WebElement editretmonth;

	public void reMonth() {
		Select Remonth = new Select(editretmonth);
		Remonth.selectByVisibleText("April");

	}

	@FindBy(xpath = "//select[contains(@name,'toDay')]")
	WebElement editretdate;

	public void reDate() {
		Select Redate = new Select(editretdate);
		Redate.selectByValue("22");
	}

	@FindBy(xpath = "(//input[contains(@name,'servClass')])[1]")
	WebElement editserclass;

	public void serviceClass() {
		editserclass.click();
	}

	@FindBy(xpath = "//input[contains(@name,'findFlights')]")
	WebElement clickcontinue;

	public void clickCon() {
		clickcontinue.click();
	}

}