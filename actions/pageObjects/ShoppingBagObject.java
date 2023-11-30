package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage_01;
import pageUI.ShoppingBagUI;

public class ShoppingBagObject extends AbstractPage_01{
	WebDriver driver;
	
	public ShoppingBagObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToProceedToCheckoutButton() {
		scrollInToView(driver, ShoppingBagUI.PROCEED_CHECKOUT_BUTTON);
		clickToElement(driver, ShoppingBagUI.PROCEED_CHECKOUT_BUTTON);
		
	}

	public void clickToGuestUserButton() {
		scrollInToView(driver, ShoppingBagUI.GUEST_USER_BUTTON);
		clickToElement(driver, ShoppingBagUI.GUEST_USER_BUTTON);
		
	}

}
