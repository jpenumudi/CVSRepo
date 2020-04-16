package com.cvs.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CVSTests {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true"); // Stops showing starting chrome browser...... in the console
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.get("https://www.cvs.com/");
		
		// search functionality
		
		WebElement search = driver.findElement(By.name("searchTerm"));
		search.click();
		search.sendKeys("water");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"flex-button-search\"]/button/svg[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"flex-button-search\"]/button")).click();
		System.out.println("Search results for water displayed");
		
		driver.findElement(By.linkText("Shop Online")).click();
		System.out.println("Clicked on Shop Online link");
		

		driver.close();
	
	}

}
