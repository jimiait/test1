package lunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChrome {
	
	//variable
	//method
	
	public static void main(String[] args) {
		
		//Lunch Chrome Driver
		WebDriver driver = new ChromeDriver();
		
		//Go to website
		driver.get("https://www.google.com/index.html");
		
		//Maximize it
		driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		
	}
}
