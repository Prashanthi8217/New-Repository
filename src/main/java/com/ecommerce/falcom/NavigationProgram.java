package com.ecommerce.falcom;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationProgram {

	public static void main(String[] args) throws Exception{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(4000);
	driver.get("https://www.orangehrm.com/");
	Thread.sleep(4000);
	driver.manage().window().minimize();
	Thread.sleep(4000);
	driver.get("https://www.goibibo.com/");
	Thread.sleep(4000);
	driver.manage().window().maximize();
	Thread.sleep(4000);
	driver.manage().window().setSize(new Dimension(100,200));
	driver.manage().window().maximize();
	Thread.sleep(4000);
	driver.navigate().back();
	Thread.sleep(4000);
	driver.navigate().forward();
	Thread.sleep(4000);
	driver.navigate().refresh();
	driver.close();
	
	}

}
