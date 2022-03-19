package com.juaracoding.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverMethod {
	
	public void isiDriverMethod() {
		System.setProperty("webdriver.chromedriver", "C:\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 150);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0, 500)");
		
		WebElement clickElemn = driver.findElement(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(1)"));
		clickElemn.click();
		
		JavascriptExecutor jee = (JavascriptExecutor) driver;
		jee.executeScript("window.scrollBy(0, 500)");
	}

}
