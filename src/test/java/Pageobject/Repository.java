package Pageobject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Repository  {
	
	public static WebDriver driver;
  @Test 
 public static void login() throws InterruptedException {
	  
			driver.findElement(Locators.Username).sendKeys(TestData.Username);
			Thread.sleep(3000);
			driver.findElement(Locators.Password).sendKeys(TestData.Password);
			Thread.sleep(3000);
			driver.findElement(Locators.Signin).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Apple\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get(TestData.url);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
