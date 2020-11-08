package moni;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\JAIN\\Desktop\\selenium\\chromedriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//IMPLICIT WAIT
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		//EXPLICIT WAIT
		WebDriverWait wait=new WebDriverWait(driver,5);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("identifierId")));
		driver.findElement(By.id("identifierId"));
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src, new File("c:\\tmp\\screenshot.png"));
		FileHandler.copy(src, new File("C:\\Users\\JAIN\\Desktop\\screenshot.png"));
	    System.out.println("img is saved");
	  

}
	
}
