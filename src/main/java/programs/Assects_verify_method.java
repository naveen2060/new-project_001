package programs;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Assects_verify_method {
	
	public WebDriver driver;
	
  @Test
  public void assertion() {
	
	String actual = "mercury tours";
	String expected = driver.getTitle();
	System.out.println("pass");
	
	try {
	Assert.assertEquals(actual,expected);
	
	} catch (Throwable t) {
		
		System.out.println("fail");
	}
			
	
	

	
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Apple\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("http://demo.guru99.com/test/newtours/");
	  
	  
	  String ATM = "screenshot";
	  
	  File scrFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  org.openqa.selenium.io.FileHandler.copy(scrFile, new File("E:\\Automation_project_2020\\maventest2020\\screenshots\\"+ATM+".png"));
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
