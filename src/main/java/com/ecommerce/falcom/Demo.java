package com.ecommerce.falcom;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		String expectedTitle="MakeMyTrip";
		String expectedUrl="makemytrip";
		driver.get("https://www.makemytrip.com/");
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(4000);
		driver.navigate().refresh();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.manage().window().setSize(new Dimension(100,200));
		Thread.sleep(4000);
		driver.manage().window().setPosition(new Point(300,400));
		Thread.sleep(4000);
		driver.manage().window().maximize();
		String actualTitle=driver.getTitle();
		String actualUrl=driver.getCurrentUrl();
		if(actualTitle.contains(expectedTitle)&& actualUrl.contains(expectedUrl));
		{
		System.out.println("validation successfull");
		}
	}
}
