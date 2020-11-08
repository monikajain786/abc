package moni;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class keyboardMouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\MONIKA\\selenium\\chromedriver\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		driver.get("http://dbankdemo.com/login");
		WebElement element = driver.findElement(By.id("username"));
		//creating interface
		Actions actions = new Actions(driver);
		Action seriesOfActions = actions
				.moveToElement(element)
				.click()
				.keyDown(element,Keys.SHIFT)
				.sendKeys("monika")
				.keyUp(element,Keys.SHIFT)
				.doubleClick(element)
				.contextClick()
				.build();
		seriesOfActions.perform();
		
		//---------------------OR------------
		
		actions.moveToElement(element).contextClick().build().perform();
				
				

	}

}
