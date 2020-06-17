package com.Jenks.test.com.Jenks.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class JenkTest {
	
	
	@Test
	
	public void openGoogle() {
		System.out.println("Hello there....");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MILIND.KAMU\\Downloads\\Jenkins\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://google.com");
		
		WebDriverWait ww = new WebDriverWait(driver,50);
		ww.until(ExpectedConditions.titleContains("Google"));
		ww.until(ExpectedConditions.visibilityOf( driver.findElement(By.xpath("//input[@name='q']")) ) );
		try {
			Thread.sleep(40);
			driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
