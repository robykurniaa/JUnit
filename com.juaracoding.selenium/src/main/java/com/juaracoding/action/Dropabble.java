package com.juaracoding.action;

import java.awt.Desktop.Action;
import java.awt.dnd.DragGestureEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropabble {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver", "C:\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0, 200)");
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("#content > iframe")));
		
		WebElement draggable =  driver.findElement(By.id("draggable"));
		WebElement droppable =  driver.findElement(By.id("droppable"));
		
		Actions dragAndDrop = new Actions(driver);
		dragAndDrop.dragAndDrop(draggable, droppable).build().perform();
	}

}
