package com.Alisha;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bootstrap {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	  //  driver.findElement("//span[text()='HTML, CSS']");
	    
	    Thread.sleep(4000);
	    

	}

}
