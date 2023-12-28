package firstestngpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FirstTestNg {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "C:\\selenium\\chromedriver-win64\\chromedriver-win64.exe";
    public WebDriver driver ; 
    

     
  @Test
  public void verifyHomepageTitle() {
	    driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
       
      System.out.println("launching firefox browser"); 
      System.setProperty("WebDriver.chrome.driver", driverPath);
     ChromeDriver driver = new ChromeDriver();
      driver.get(baseUrl);
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = driver.getTitle();
      Assert.assertEquals(actualTitle, expectedTitle);
      driver.close();
  }
}