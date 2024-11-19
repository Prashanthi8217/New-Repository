package com.ecommerce.falcom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocSearchProduct {

	public static void main(String[] args)throws Exception {
		String HomePageExcepctedData="Online Shopping";
		String PLPPageExcepctedData="search";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		String actualHomeData=driver.getTitle();
		if(actualHomeData.contains(HomePageExcepctedData)) {
			System.out.println("Homepage validation successfull");
		}
		Thread.sleep(4000);
		WebElement element=driver.findElement(By.className("Pke_EE"));
		element.sendKeys("iphone 16");
		Thread.sleep(4000);
		driver.findElement(By.className("KzDlHZ")).click();
		String actualplpPageUrl=driver.getCurrentUrl();
		if(actualplpPageUrl.contains(PLPPageExcepctedData)) {
			System.out.println("plppage validation successfull");
		}
		driver.close();

	}

}
