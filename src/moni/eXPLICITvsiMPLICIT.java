package moni;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class eXPLICITvsiMPLICIT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//when we load our page then it is not necessary that it will open immediately,it will take some time and selenium will not going to wait for that, so selenium has synchronization for implicit as well as explicit
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JAIN\\Desktop\\selenium\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//implicit wait always applied globally and avail for all websites
		//dynamic wait..move and perform next actions
		//available for all web elements
		//directly applied on driver
		//we should avoid using these two waits together because imliciylt wait for 20 secs abd then wait for 10 secs more(exp wait for firstname )
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement firstName = driver.findElement(By.name("firstname"));
		WebElement lastName = driver.findElement(By.name("lastname"));
		WebElement mobile = driver.findElement(By.name("reg_email__"));
		WebElement pwd = driver.findElement(By.name("reg_passwd__"));
		
	
		
		sendKeys(driver, firstName, 10, "MONIKA");
		sendKeys(driver, lastName, 5, "JAIN");
		//we can change the time accordingly
		sendKeys(driver, mobile, 5, "9560160789");
		sendKeys(driver, pwd, 10, "dhirajjain");
		
		
		WebElement forgotAccount = driver.findElement(By.linkText("Forgotten account?"));
		clickOn(driver, forgotAccount, 5);
	
	}

	public static void sendKeys(WebDriver driver, WebElement element, int timeout, String value) {
		// TODO Auto-generated method stub
		new WebDriverWait(driver, timeout).
		until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	}
     public static void clickOn(WebDriver driver, WebElement element, int timeout) {
    	 new WebDriverWait(driver, timeout).
    	 until(ExpectedConditions.elementToBeClickable(element));
    	 element.click();
     }
	

}
