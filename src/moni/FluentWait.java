package moni;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class FluentWait {

	public static void main(String[] args) throws InterruptedException {
		
//in this we can cahnge the default polling period based on our requirement
//250 milliseconds
//it is an implementation of wait surface
//defines a max amt of time for a condition & we can give the frequency with which to check the condition
//we can also ignore any exception while polling element such as NoSuchElement exception in selenium
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JAIN\\Desktop\\selenium\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
	driver.findElement(By.name("q")).sendKeys("JOBS FOR MCA");
	driver.findElement(By.xpath("//input[@class='gNO89b']")).submit();
	driver.findElement(By.linkText("Mca Fresher Jobs in India - Timesjobs"));
	Thread.sleep(5000);
	
	
	}
	
	// it will automatically thrown an exception and did not wait for the link to load , this is why we need waits in selenium because in real world our applications will behave differently with different instances based on diff env factors like network slow n ol
	//FLUENT WAIT
	
	
/*Wait<WebDriver> wait =  new FluentWait<WebDriver>(driver)
	.withTimeout(30, TimeUnit.SECONDS)
	.pollingEvery(5, TimeUnit.SECONDS)
	.ignoring(NoSuchElementException.class);
	
WebElement foo = wait.until (new Function<WebDriver,WebElement>(){
		public WebElement apply(WebDriver driver) {	
		WebElement linkElement =  driver.findElement(By.id("foo"));

		
		}
	});
	
	
	*/


	private Object withTimeout(int i, TimeUnit seconds) {
		// TODO Auto-generated method stub
		return null;
	}
}
