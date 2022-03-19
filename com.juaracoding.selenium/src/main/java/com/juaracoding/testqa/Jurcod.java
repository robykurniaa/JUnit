package com.juaracoding.testqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Jurcod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "C:\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://lms.juaracoding.com/login/index.php");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 150);
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0, 500)");
		
		WebElement inputEmail = driver.findElement(By.id("username"));
		inputEmail.sendKeys("robykurniaaa");

		WebElement inputPassword = driver.findElement(By.id("password"));
		inputPassword.sendKeys("JuaraCoding@2022");
		
		WebElement login = driver.findElement(By.id("loginbtn"));
		login.click();
	}
	

}
