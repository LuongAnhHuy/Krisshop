package Test_01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Topic_00 {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void TC_01_Button() {
		// Step 01
		driver.get("https://www.fahasa.com/customer/account/create");
		// Step 02
		driver.findElement(By.xpath("//li[@class='popup-login-tab-item popup-login-tab-login']")).click();
		// Step 03
		WebElement loginButton = driver.findElement(By.xpath("//button[@class='fhs-btn-login']"));
		Assert.assertFalse(loginButton.isEnabled());
		// Step 04
		String loginButtonBackgroundColor = driver.findElement(By.xpath("//button[@class='fhs-btn-login']")).getCssValue("background-color");
		Color loginButtonColor = Color.fromString(loginButtonBackgroundColor);
		String loginButtonHexa = loginButtonColor.asHex().toUpperCase();
		Assert.assertEquals(loginButtonHexa, "#000000");
		// Step 05
		driver.findElement(By.xpath("//input[@id='login_username']")).sendKeys("automationfc@gmail.com");
		driver.findElement(By.xpath("//input[@id='login_password']")).sendKeys("haha123456");
		// Step 06
		Assert.assertTrue(loginButton.isEnabled());
		// Step 07
		String loginButtonBackgroundColor1 = driver.findElement(By.xpath("//button[@class='fhs-btn-login']")).getCssValue("background-color");
		Color loginButtonColor1 = Color.fromString(loginButtonBackgroundColor1);
		String loginButtonHexa1 = loginButtonColor1.asHex().toUpperCase();
		Assert.assertEquals(loginButtonHexa1, "#C92127");
		
		
		}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
