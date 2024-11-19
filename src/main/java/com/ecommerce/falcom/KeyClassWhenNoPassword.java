package com.ecommerce.falcom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class KeyClassWhenNoPassword {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebElement element=null;
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(5000);
		element=driver.findElement(By.xpath(""));
		element.sendKeys("admin",Keys.TAB,"admin123",Keys.TAB,Keys.ENTER);
	}

}
