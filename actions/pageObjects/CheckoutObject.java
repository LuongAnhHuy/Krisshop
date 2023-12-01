package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage_01;
import pageUI.CheckoutUI;

public class CheckoutObject extends AbstractPage_01{
	WebDriver driver;
	
	public CheckoutObject(WebDriver driver) {
		this.driver = driver;
	}
	public void selectTitleDropdown(String itemValue) {
		waitToElementPresence(driver, CheckoutUI.TITLE_DROPDOWN_LIST);
		selectItemInDropdow(driver, CheckoutUI.TITLE_DROPDOWN_LIST, itemValue);
		
	}

	public void inputToFirstName(String firstname) {
		sendkeyToElement(driver, CheckoutUI.FIRST_NAME_TEXTBOX, firstname);
		
	}

	public void inputToLastName(String lastname) {
		sendkeyToElement(driver, CheckoutUI.LAST_NAME_TEXTBOX, lastname);
		
	}

	public void inputToEmailAddress(String email) {
		sendkeyToElement(driver, CheckoutUI.EMAIL_TEXTBOX, email);
		
	}

	public void inputToRegionCode(String regionCode) {
		sendkeyToElement(driver, CheckoutUI.REGION_CODE_TEXTBOX, regionCode);
		
	}

	public void inputToPhoneNumber(String phone) {
		sendkeyToElement(driver, CheckoutUI.PHONE_NUMBER_TEXTBOX, phone);
		
	}

	public void selectRegionDropdown(String region) {
		selectItemInDropdow(driver, CheckoutUI.REGION_DROPDOWN_LIST, region);
		
	}

	public void inputToAddressSearch(String address) {
		sendkeyToElement(driver, CheckoutUI.ADDRESS_TEXTBOX, address);
		pressEnterToBoard(driver);
		
	}
	public void selectToAddressSearch() {
		waitToElementPresence(driver, CheckoutUI.ADDRESS_DROPDOWN_LIST);
		clickToElement(driver, CheckoutUI.ADDRESS);
		
		
	}
	public void clickToAddAddressManuallyButtonn() {
		waitToElementClickable(driver, CheckoutUI.ADD_ADDRESS_HYPERLINK);
		clickToElement(driver, CheckoutUI.ADD_ADDRESS_HYPERLINK);
		
	}

}
