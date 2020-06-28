package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public WebDriver driver;
	String browser = new String("chrome");
	
	public void getDriver() {
	WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("http://newtours.demoaut.com/mercurysignon.php");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
}