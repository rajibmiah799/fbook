package com.bookingstepdef;

import org.testng.Assert;

import com.common.Base;
import com.objectpage.BookingPage;
import com.objectpage.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlightBookingStep extends Base {
	HomePage hp;
	BookingPage bp;

	@Given("^user on sign on page$")
	public void user_on_sign_on_page() {
		getDriver();

	}

	@When("^user enter \"([^\"]*)\", \"([^\"]*)\"$")
	public void user_enter(String username, String password) {
		hp = new HomePage(driver);
		hp.enterUsername(username);
		hp.enterpassword(password);
	}

	@When("^user click on submit$")
	public void user_click_on_submit() {
		hp.submitbuttom();

	}

	@When("^user enter \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", <\"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void user_enter(String type, String passengers, String depertingfrom, String onmonth, String ondate,
			String arrvingin, String returningmonth, String returningdate, String serviceclass) {
		bp = new BookingPage(driver);
		bp.clickroundtrip();
		bp.passenger();
		bp.deAirport();
		bp.deMonth();
		bp.deDate();
		bp.arriveAirport();
		bp.reMonth();
		bp.reDate();
		bp.serviceClass();

		/*
		 * WebElement editpassenger =
		 * driver.findElement(By.xpath("//select[@name='passCount']")); Select sel = new
		 * Select(editpassenger); sel.selectByValue("2");
		 */
		// cont shift forword slass(/)
		// cont shift back slass (\)

	}

	@When("^user click on continue$")
	public void user_click_on_continue() {
		bp.clickCon();
	}

	@Then("^user see some relevent air tickets$")
	public void user_see_some_relevent_air_tickets() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Select a Flight: Mercury Tours");
		driver.close();
		// driver.quit();

	}

}
