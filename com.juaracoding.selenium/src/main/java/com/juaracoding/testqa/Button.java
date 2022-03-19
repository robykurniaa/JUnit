package com.juaracoding.testqa;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Button {
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "C:\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0, 500)");
		
		WebElement clickElemn = driver.findElement(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(1)"));
		clickElemn.click();
		
		JavascriptExecutor jee = (JavascriptExecutor) driver;
		jee.executeScript("window.scrollBy(0, 500)");
		
//		select element button
		WebElement clickButton = driver.findElement(By.id("item-4"));
		clickButton.click();

		
//		cek double click
		WebElement doubleClick = driver .findElement(By.cssSelector("#doubleClickBtn"));
		act.doubleClick(doubleClick).perform();
		
//		cek right click
		WebElement rightClick = driver .findElement(By.cssSelector("#rightClickBtn"));
		act.contextClick(rightClick).perform();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
//		cek satu kali klik
		WebElement oneClick = driver .findElement(By.cssSelector("#vIgrC"));
		wait.until(ExpectedConditions.elementToBeClickable(oneClick));
		oneClick.click();
	
		
	}

}
