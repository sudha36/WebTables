package seleniumwebtables;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTablesExamples {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("http:\\www.w3schools.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='mySidenav']/div/a[1]")).click();
		driver.findElement(By.xpath(".//*[@id='leftmenuinnerinner']/a[18]")).click();
			
		
		
		
	}

}
