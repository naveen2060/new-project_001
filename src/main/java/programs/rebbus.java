package programs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class rebbus {
	
	public WebDriver driver;
	
	public Actions action;
  @Test
  public void ticketbooking() throws Exception {
	  
	  driver.findElement(By.id("src")).sendKeys("miyapur,hyderabad");
	  Thread.sleep(3000);
	  driver.findElement(By.id("dest")).sendKeys("Banglore Airport, Banglore");
	  
	 
	  driver.findElement(By.id("onward_cal")).click();
	  
	  driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[5]/td[7]")).click();
	  
	  driver.findElement(By.id("search_btn")).click();
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Apple\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.redbus.in/");
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
