package com.juaracoding.google;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CobaSelenium2 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "C:\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

		WebElement inputSearch = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
			
//		WebElement btnSearch = 	driver.findElement(By.xpath(null));
		
		inputSearch.sendKeys("wikipedia");
		inputSearch.sendKeys(Keys.RETURN); //untuk mengenter pencarian/form
	}

}
