package com.ecommerce.falcom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathlocator {

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
		Thread.sleep(5000);
		element=driver.findElement(By.xpath("//div[text()='Apple iPhone 13 (Midnight, 128 GB)]"));
		String text=element.getText();
		System.out.println(text);
		Thread.sleep(5000);
		element.click();
		Thread.sleep(5000);
		driver.quit();
	}

}
