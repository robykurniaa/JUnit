package com.juaracoding.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CobaSelenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "C:\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		String element_txt = driver.findElement(By.cssSelector("#content > div > div > div > div._8esl > h2")).getText();

		System.out.println(element_txt);

		String element_txt2 = driver.findElement(By.cssSelector("#reg_pages_msg")).getText();

		System.out.println(element_txt2);	


		WebElement createPage = driver.findElement(By.cssSelector("#reg_pages_msg > a"));
		createPage.click();

		driver.navigate().back();

		WebElement inputEmail = driver.findElement(By.id("email"));
		inputEmail.sendKeys("kirim text");

		WebElement inputPassword = driver.findElement(By.id("pass"));
		inputPassword.sendKeys("kirim password");

		

			}
}


