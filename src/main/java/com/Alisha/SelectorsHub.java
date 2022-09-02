package com.Alisha;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectorsHub {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.SECONDS);
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		driver.findElement(By.xpath("//input[@id='userId']")).sendKeys("xyz");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("xyz co.");
		driver.findElement(By.cssSelector("#inp_val")).sendKeys("Al");
		//L.sendKeys("xyz company");
		//WebElement jx=driver.findElement(By.xpath("//div[@id='snacktime']"));
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript(null, args):
		driver.switchTo().frame("//div[@id='snacktime']");
		//driver.switchTo().frame("pact");

	}

	
	}


