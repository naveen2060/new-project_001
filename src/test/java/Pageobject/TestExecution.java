package Pageobject;

import org.testng.annotations.Test;

public class TestExecution extends Repository {
	
  @Test
 public void verifylogin() throws InterruptedException {

 Repository.login();
 Thread.sleep(5000);

  }
}
