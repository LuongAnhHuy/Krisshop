package com.krisshop.user;

import org.testng.annotations.Test;

import pageObjects.CheckoutObject;
import pageObjects.HomePageObject;
import pageObjects.ShoppingBagObject;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Testcase_01 {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	HomePageObject homepage;
	ShoppingBagObject shoppingbag;
	CheckoutObject checkout;

  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.krisshop.com/en/");
  }
  @Test
  public void TC_01() {
	  homepage = new HomePageObject(driver);
	  
	  // Step 01: Click to Shop for Travelled
	  homepage.clickToShopForTravelled();
	  
	  // Step 02: Search to Tiger Balm
	  homepage.sendkeyToTexbox("Tiger Balm");
	  
	  homepage.clickToSearchButton();
	  
	  homepage.clickToImage();
	  
	  // Step 03: Click to Add To Bag
	  homepage.clickToAddToBagButton();
	  
	  // Step 04: Click to Proceed with shipping to Singapore button
	  homepage.clickToProceedSingaporeButton();
	  
	  // Step 05: Click to Shopping Bag button
	  homepage.clickToShoppingBagButton();
	  
	  shoppingbag = new ShoppingBagObject(driver);
	  
	  // Step 06: Click to Proceed to check out
	  shoppingbag.clickToProceedToCheckoutButton();
	  
	  // Step 07: Click to Continue as guest button
	  shoppingbag.clickToGuestUserButton();
	  
	  checkout = new CheckoutObject(driver);
	  
	  // Step 08: Fill to Billing Address
	  checkout.selectTitleDropdown("Mr");
	  
	  checkout.inputToFirstName("Khanh Linh");
	  
	  checkout.inputToLastName("Nguyen");
	  
	  checkout.inputToEmailAddress("linhbiga123@gmail.com");
	  
	  checkout.inputToRegionCode("+84");
	  
	  checkout.inputToPhoneNumber("0796789766");
	  
	  checkout.selectRegionDropdown("Vietnam");
	  
	  checkout.inputToAddressSearch("260 Đội Cấn");
	  
	  
	  
	  //checkout.selectToAddressSearch();
	  
	  
  }

  @AfterClass
  public void afterClass() {
	  //driver.quit();
  }

}
