package com.ecommerce.falcom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPrintStartWithS {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(4000);
		driver.get("www.amazon.in");
		Thread.sleep(5000);
		 WebElement element=driver.findElement(By.xpath(""));
		Select  s=new Select(element);
		s.selectByIndex(2);
		List<WebElement> options=s.getOptions();
		for(WebElement opt:options)
		{
			if(opt.getText().startsWith("s"));
			{
				System.out.println(opt.getText());
			}
		}

	}

}
