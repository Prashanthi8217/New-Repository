package com.ecommerce.falcom;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenShotHandling {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(5000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		Thread.sleep(4000);
		File src=ts.getScreenshotAs(OutputType.FILE);
		Thread.sleep(4000);
		File dest=new File("absolute path");
		Thread.sleep(4000);
		Files.copy(src, dest);
		}
}
//    if we want to takescreenshot of webelement 
//    File src=ele.getScreenshotAs(OutputType.FILE);
//    File dest=new File("absolute path");
//    Files.copy(src, dest);