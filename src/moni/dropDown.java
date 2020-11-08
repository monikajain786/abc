package moni;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class dropDown {
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JAIN\\Desktop\\selenium\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("Create New Account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("MONIKA");
		driver.findElement(By.name("lastname")).sendKeys("JAIN");
	    driver.findElement(By.name("reg_email__")).sendKeys("monika6.jain2015@gmail.com");
		 driver.findElement(By.name("reg_passwd__")).sendKeys("omsainath786");;
		
		WebElement month_dropDown = driver.findElement(By.id("month"));
	    Select month_dd = new Select(month_dropDown);
	    
	    month_dd.selectByIndex(10);
	    
	    Thread.sleep(3000);
	    
	    month_dd.selectByValue("9");
	    
	    Thread.sleep(3000);
	    
	    month_dd.selectByVisibleText("Sept");
	    
		
	/*sendKeys(driver, firstName, 10, "MONIKA");
		sendKeys(driver, lastName, 5, "JAIN");
		//we can change the time accordingly
		sendKeys(driver, mobile, 5, "9560160789");
		sendKeys(driver, pwd, 10, "dhirajjain");
	}
	public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value) {
		// TODO Auto-generated method stub
		new WebDriverWait(driver, timeout).
		until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);*/

}
}
