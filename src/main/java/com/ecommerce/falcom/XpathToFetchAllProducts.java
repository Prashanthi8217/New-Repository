package com.ecommerce.falcom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathToFetchAllProducts {

	public static void main(String[] args) throws Exception {
		WebElement element=null;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		element=driver.findElement(By.xpath("//input[@name='q']"));
		element.sendKeys("iphone14");
		element.submit();
		Thread.sleep(4000);
		List<WebElement> elements=driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		Thread.sleep(4000);
		for(int i=0;i<=elements.size()-1;i++)
		{
			String values=elements.get(i).getText();
			System.out.println(values);
			Thread.sleep(4000);
			driver.close();
			
		}
	}


	}


