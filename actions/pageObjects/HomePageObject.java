package pageObjects;

import org.openqa.selenium.WebDriver;

import commons.AbstractPage_01;
import pageUI.HomePageUI;

public class HomePageObject extends AbstractPage_01 {
	WebDriver driver;
	
	public HomePageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void clickToShopForTravelled() {
		waitToElementClickable(driver, HomePageUI.SHOP_FOR_TRAVELLERS_BUTTON);
		clickToElement(driver, HomePageUI.SHOP_FOR_TRAVELLERS_BUTTON);
		
	}

	public void sendkeyToTexbox(String name) {
		sendkeyToElement(driver, HomePageUI.SEARCH_BAR, name);
		
	}

	public void clickToSearchButton() {
		clickToElement(driver, HomePageUI.SEARCH_ICON);
		
	}

	public void clickToImage() {
		scrollInToView(driver, HomePageUI.TIGER_BALM_ICON);
		clickToElement(driver, HomePageUI.TIGER_BALM_ICON);
		
	}

	public void clickToAddToBagButton() {
		scrollInToView(driver, HomePageUI.ADD_TO_BAG_BUTTON);
		waitToElementClickable(driver, HomePageUI.ADD_TO_BAG_BUTTON);
		clickToElement(driver, HomePageUI.ADD_TO_BAG_BUTTON);
		
	}

	public void clickToProceedSingaporeButton() {
		waitToElementClickable(driver, HomePageUI.PROCEED_TO_SINGAPORE_BUTTON);
		clickToElement(driver, HomePageUI.PROCEED_TO_SINGAPORE_BUTTON);
		
	}

	public void clickToShoppingBagButton() {
		waitToElementClickable(driver, HomePageUI.SHOPPING_BAG_BUTTON);
		clickToElement(driver, HomePageUI.SHOPPING_BAG_BUTTON);
		
	}


}
