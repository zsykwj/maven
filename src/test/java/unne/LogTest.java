package unne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import utils.Log;

public class LogTest {
	  WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://baidu,com");
	  
		  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	 
	
  }

  @BeforeMethod
  public void beforeMethod() {
	  Log.info("Try to open browser");
	  driver=new FirefoxDriver();
	  Log.info("Browser is opened");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
