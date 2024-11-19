package com.ecommerce.falcom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class HandlingDropDown {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(4000);
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(5000);
		driver.findElement(By.xpath("")).click();
		WebElement phnoDropdown=driver.findElement(By.xpath(""));
		Select  phDropdown=new Select(phnoDropdown);
		phDropdown.selectByIndex(2);	
		Thread.sleep(5000);
		WebElement genderDropdown=driver.findElement(By.xpath(""));
		Select  genDropdown=new Select(genderDropdown);
		genDropdown.selectByValue("female");
		Thread.sleep(5000);
		WebElement CountryDropdown=driver.findElement(By.xpath(""));
		Select  counDropdown=new Select(CountryDropdown);
		counDropdown.selectByVisibleText("germany");	
	}

}
