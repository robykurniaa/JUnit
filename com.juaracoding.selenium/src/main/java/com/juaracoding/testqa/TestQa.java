package com.juaracoding.testqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestQa {
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "C:\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0, 500)");
		
		WebElement clickElemn = driver.findElement(By.cssSelector("#app > div > div > div.home-body > div > div:nth-child(1)"));
		clickElemn.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		
		WebElement clickTb = driver.findElement(By.id("item-0"));
		wait.until(ExpectedConditions.elementToBeClickable(clickTb));
		clickTb.click();
		
		WebElement inputName = driver.findElement(By.id("userName"));
		inputName.sendKeys("Robby Kurnia");
		
		WebElement inputEmail = driver.findElement(By.id("userEmail"));
		inputEmail.sendKeys("Robkurnia@gmail.com");
		
		WebElement inputAddress = driver.findElement(By.id("currentAddress"));
		inputAddress.sendKeys("Bandung");
		
		WebElement inputPermAdd = driver.findElement(By.id("permanentAddress"));
		inputPermAdd.sendKeys("Majalaya, kab. Bandung");
		
		JavascriptExecutor jee = (JavascriptExecutor) driver;
		jee.executeScript("arguments[0].scrollIntoView(true);", inputPermAdd);
		
		
		WebElement submit = driver.findElement(By.id("submit"));
		wait.until(ExpectedConditions.elementToBeClickable(submit));
		submit.click();
		
		
		

	}

}
