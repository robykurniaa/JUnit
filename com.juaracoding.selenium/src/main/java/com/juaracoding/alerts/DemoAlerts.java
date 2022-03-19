package com.juaracoding.alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoAlerts {
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "C:\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
		driver.get("http://localhost/alert/alerts.html");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement displayAlerts = driver.findElement(By.cssSelector("body > button:nth-child(2)"));
		
		WebElement promptAlert = driver.findElement(By.cssSelector("body > button:nth-child(8)"));
		WebElement txt = driver.findElement(By.cssSelector("#demo"));
		
		displayAlerts.click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert basicAlert = driver.switchTo().alert();
		tunggu();
		basicAlert.accept();
		
		WebElement confirmAlerts = driver.findElement(By.cssSelector("body > button:nth-child(5)"));
		confirmAlerts.click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert btnConfirm = driver.switchTo().alert();
		
		tunggu();
		btnConfirm.dismiss();
		
		promptAlert.click();
		wait.until(ExpectedConditions.alertIsPresent());
		Alert promptalertbtn = driver.switchTo().alert();
		
		tunggu();
		promptalertbtn.sendKeys("Juara");
		promptalertbtn.accept();
		System.out.println(txt.getText());
		
			
	}

	public static void tunggu() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
