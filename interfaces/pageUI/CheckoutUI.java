package pageUI;

public class CheckoutUI {
	public static final String TITLE_DROPDOWN_LIST = "//div[@class='formItem formItemEmpty  billingFormTitle']//child::div//child::select";
	public static final String FIRST_NAME_TEXTBOX = "//input[@id='firstname23']";
	public static final String LAST_NAME_TEXTBOX = "//input[@id='lastname24']";
	public static final String EMAIL_TEXTBOX = "//input[@id='email25']";
	public static final String REGION_CODE_TEXTBOX = "//input[@id='phoneCountryCode27']";
	public static final String PHONE_NUMBER_TEXTBOX = "//input[@id='phoneNumber28']";
	public static final String REGION_DROPDOWN_LIST = "//label[@for='countryCode29' and text() ='Country/Region']//preceding-sibling::select";
	public static final String ADDRESS_TEXTBOX = "//input[@id='addressAutoCompletionSearch30']";
	public static final String ADDRESS_DROPDOWN_LIST = "//div[@class='addressAutoCompletionSearchResult addressAutoCompletionSearchResultShow']";
	public static final String ADDRESS = "//li[@data-place-description='260 Phố Đội Cấn, Liễu Giai, Ba Đình, Hanoi, Vietnam']";
	public static final String ADD_ADDRESS_HYPERLINK = "//div[@class='addressAutoCompletionSearchResult addressAutoCompletionSearchResultShow']//child::div[contains(@class, 'SearchResultNonExistingAddressError')]/button//span";

}
