package com.ecommerce.falcom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpath {

	public static void main(String[] args)  throws Exception{
		WebElement element=null;
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		element=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		Thread.sleep(3000);
		element.sendKeys("Redmi Note9Pro");
		Thread.sleep(3000);
		element.submit();
		Thread.sleep(3000);
		element=driver.findElement(By.xpath("//div[text()='Price -- High to Low']"));
		element.click();
		Thread.sleep(3000);
		String ProductName=driver.findElement(By.xpath("//div[text()='REDMI Note 13 Pro+ 5G (World Champions Edition, 512 GB)'/../following-sibling::div/div[@class='cN1yYO]/div[@class='hl05eU']/div]")).getText();
		System.out.println(ProductName+"------->"+ProductName);
		Thread.sleep(3000);
		driver.close();
	
	}

}
