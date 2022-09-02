package com.Alisha;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumPara {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
	    driver.get("https://parabank.parasoft.com/parabank/index.htm");
	    driver.findElement(By.xpath("//a[text()='Register']")).click();
	   String actual= driver.findElement(By.xpath("//h1[@class='title']")).getText();
	  // System.out.println(actual);
	   String expected="Signing up is easy!";
	 
	  Assert.assertEquals(actual,expected);
	   
	    
	    driver.findElement(By.id("customer.firstName")).sendKeys("Zarina");
	    driver.findElement(By.id("customer.lastName")).sendKeys("Khan");
	    driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("110 Elm St");
	    driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Lynbrook");
	    driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("New York");
	    driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("11563");
	    driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("1234567899");
	    driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("1234567897");
	    driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("567899");
	    driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("A5678");
	    driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("A5678");
	    driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("1234567897");
	    driver.findElement(By.xpath("//input[@value='Register']")).click();
	    
	    
	    Thread.sleep(4000);
	    
	    driver.quit();
	    
	}



	}


