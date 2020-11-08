package moni;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest2 {
WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }
  
  @Test()
  public void C() {
	  System.out.println("Inside method C");
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\JAIN\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
	  
	  driver.close();
  }
  
  
  @Test()
  public void D() {
	  System.out.println("Inside method D");
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\JAIN\\Desktop\\selenium\\chromedriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
	  
	  driver.close();
  }
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
