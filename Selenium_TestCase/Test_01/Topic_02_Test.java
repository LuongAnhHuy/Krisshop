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

public class Topic_02_Test {
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
	public void TC_01_Click_To_Register() {
		driver.get("https://demo.nopcommerce.com/");
		WebElement registerButton = driver.findElement(By.xpath("//a[@class='ico-register']"));
		registerButton.click();
		// Get Text khi điều hướng sang trang Register
		WebElement text = driver.findElement(By.xpath("//h1[text()='Register']"));
		String textValue = text.getText();
		System.out.println("Text hiển thị là: " + textValue);
		}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
