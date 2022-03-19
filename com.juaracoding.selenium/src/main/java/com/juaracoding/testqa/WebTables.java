package com.juaracoding.testqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTables {
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
		scroll.executeScript("window.scrollBy(0, 350)");
		
//		select element
		WebElement clickButton = driver.findElement(By.id("item-3"));
		clickButton.click();
		
		WebElement add = driver.findElement(By.id("addNewRecordButton"));
		add.click();
		
		//input first name
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("Roby");
		
		//inout last name
		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.sendKeys("Kurnia");
		
		//email
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("robykurnia@gmail.com");
		
		//input age
		WebElement age = driver.findElement(By.id("age"));
		age.sendKeys("20");
		
		//imput salary
		WebElement salary = driver.findElement(By.id("salary"));
		salary.sendKeys("9000000");
		
		//inout departman
		WebElement departmen = driver.findElement(By.id("department"));
		departmen.sendKeys("IT");
		
		//click submit
		WebElement submit = driver.findElement(By.id("submit"));
		submit.click();
		
		//input search
		WebElement search = driver.findElement(By.id("searchBox"));
		search.sendKeys("Roby");
		
		WebElement edit = driver.findElement(By.cssSelector("#edit-record-4 > svg"));
		edit.click();
		
		//delete last name
		WebElement lastNameEdit = driver.findElement(By.id("lastName"));
		lastNameEdit.sendKeys("Ramdahan");
		
		
	}

}
