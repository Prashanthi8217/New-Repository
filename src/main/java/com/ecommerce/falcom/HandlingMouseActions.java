package com.ecommerce.falcom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandlingMouseActions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(4000);
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(5000);
		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		Actions act=new Actions(driver);
		WebElement yesButtton=driver.findElement(By.xpath(""));
		WebElement noButtton=driver.findElement(By.xpath(""));
		WebElement numButtton=driver.findElement(By.xpath(""));
		act.doubleClick(yesButtton).perform();
		act.doubleClick(noButtton).perform();
		act.doubleClick(numButtton).perform();
		String yesValue=driver.findElement(By.xpath("")).getText();
		String noValue=driver.findElement(By.xpath("")).getText();
		String numValue=driver.findElement(By.xpath("")).getText();
		if(yesValue.contains("yes") && noValue.contains("no")&&numValue.contains("4")) {
			System.out.println("validation success");
		}
		else {
			System.out.println("validation fails");
		}
		
	}

}
