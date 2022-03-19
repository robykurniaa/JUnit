package com.juaracoding.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFrame {
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver", "C:\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();

//		WebElement iFrameElement = driver.findElement(By.id(""));
		driver.switchTo().frame("frame1");
		WebElement txtIFrame = driver.findElement(By.id("sampleHeading"));
		System.out.println(txtIFrame.getText());
	}

}
