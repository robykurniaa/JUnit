package com.juaracodoing.week3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestPositive {
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
		tunggu();
		clickButton.click();
		
//		add
		WebElement add = driver.findElement(By.id("addNewRecordButton"));
		tunggu();
		add.click();
		
		//input first name
		WebElement firstName = driver.findElement(By.id("firstName"));
		tunggu();
		firstName.sendKeys("Roby");
		
		//inout last name
		WebElement lastName = driver.findElement(By.id("lastName"));
		tunggu();
		lastName.sendKeys("Kurnia");
		
		//email
		WebElement email = driver.findElement(By.id("userEmail"));
		tunggu();
		email.sendKeys("robykurnia@gmail.com");
		
		//input age
		WebElement age = driver.findElement(By.id("age"));
		tunggu();
		age.sendKeys("20");
		
		//imput salary
		WebElement salary = driver.findElement(By.id("salary"));
		tunggu();
		salary.sendKeys("9000000");
		
		//input departman
		WebElement departmen = driver.findElement(By.id("department"));
		tunggu();
		departmen.sendKeys("IT");
		
		//click submit
		WebElement submit = driver.findElement(By.id("submit"));
		tunggu();
		submit.click();
		
		//input search
		WebElement search = driver.findElement(By.id("searchBox"));
		tunggu();
		search.sendKeys("Roby");
		
		//edit
		WebElement edit = driver.findElement(By.cssSelector("#edit-record-4 > svg"));
		tunggu();
		edit.click();
		
//		exit edit
		WebElement closeEdit = driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > div.modal-header > button > span:nth-child(1)"));
		tunggu();
		closeEdit.click();
		
		//delete
		WebElement delete = driver.findElement(By.cssSelector("#delete-record-4 > svg"));
		tunggu();
		delete.click();
		driver.navigate().refresh();
		
		
	}
	
	public static void tunggu() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
