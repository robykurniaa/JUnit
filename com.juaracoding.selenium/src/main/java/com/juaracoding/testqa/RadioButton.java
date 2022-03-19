package com.juaracoding.testqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButton {
public static void main(String[] args) {
	System.setProperty("webdriver.chromedriver", "C:\\chromedriver.exe");
	WebDriver driver  = new ChromeDriver();
	
	driver.get("https://demoqa.com/");
	driver.manage().window().maximize();
	
	WebDriverWait wait = new WebDriverWait(driver, 150);
	JavascriptExecutor scroll = (JavascriptExecutor) driver;
	scroll.executeScript("window.scrollBy(0, 500)");
	
	WebElement clickElemn = driver.findElement(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(1)"));
	clickElemn.click();
	
	scroll.executeScript("window.scrollBy(0, 500)");
	
//	select element button
	WebElement clickButton = driver.findElement(By.id("item-2"));
	clickButton.click();

	
	WebElement buttonYes = driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > div:nth-child(2)"));
	wait.until(ExpectedConditions.elementToBeClickable(buttonYes));
	
	buttonYes.click();
	
	WebElement buttonImmersive = driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > div:nth-child(3)"));
	wait.until(ExpectedConditions.elementToBeClickable(buttonImmersive));
	buttonImmersive.click();
	
	WebElement buttonNo = driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2)"));
	wait.until(ExpectedConditions.elementToBeClickable(buttonNo));
	buttonNo.click();
}
}
