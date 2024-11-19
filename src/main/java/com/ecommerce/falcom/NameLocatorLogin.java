package com.ecommerce.falcom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocatorLogin {

	public static void main(String[] args)throws Exception{
		WebElement element=null;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.get("https://demoapps.qspiders.com/ui/login");
		Thread.sleep(5000);
		element=driver.findElement(By.name("email"));
		element.sendKeys("prashu82@gmail.com");
		Thread.sleep(4000);
		element=driver.findElement(By.name("password"));
		element.sendKeys("saryu12");
		Thread.sleep(4000);
	    element.submit();

	}
}

