package com.ecommerce.falcom;

import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowScrollingOperation {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(4000);
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(5000);
		driver.findElement(By.xpath(""));
		// keyboard stroke
		//Robot r =new Robot();
		//For(int i=0;i<2;i++){
		//r.keyPress(KeyEvent.VK_PAGE_DOWN);
		//r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}
		     //Using mouse actions
	    // WebElement element=driver.findElement(By.xpath(""));
       //  Actions act=new Actions(driver);
	   //  act.scrollToElement(element).perform();
	   
	//using javascript executor
	//JavascriptExecutor jse=(JavascriptExecutor)driver;
	//jse.executeScript("Window.scrollBy(0,800)");

		
	}

