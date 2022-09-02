package com.Alisha;

   import java.util.concurrent.TimeUnit;

   import org.openqa.selenium.WebDriver;
   import org.openqa.selenium.chrome.ChromeDriver;

    import io.github.bonigarcia.wdm.WebDriverManager;

    public class SeleniumNavigate123 {

	public static void main(String[] args) {
		
						
				WebDriverManager.chromedriver().setup();
				WebDriver driver =new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(6000l, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(3000l, TimeUnit.SECONDS);
				driver.get("https://www.google.com/");
				driver.navigate().to("https://www.facebook.com/");
				driver.navigate().back();
				driver.navigate().forward();
				driver.navigate().refresh();
				driver.quit();
				

			}


	}


