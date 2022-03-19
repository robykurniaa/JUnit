package com.juaracoding.testqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBox {
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
		
		
		WebElement clickCheckBox = driver.findElement(By.id("item-1"));
		wait.until(ExpectedConditions.elementToBeClickable(clickCheckBox));
		clickCheckBox.click();
		
		WebElement checkBox1 = driver.findElement(By.cssSelector("#tree-node > ol > li > span > button > svg"));
		checkBox1.click();
		
		WebElement checboxDesktop = driver.findElement(By.cssSelector("#tree-node > ol > li > ol > li:nth-child(1) > span > label > span.rct-checkbox > svg"));
		checboxDesktop.click();
		
		WebElement checboxDocuments = driver.findElement(By.cssSelector("#tree-node > ol > li > ol > li:nth-child(2) > span > label > span.rct-checkbox > svg"));
		checboxDocuments.click();

	}

}
