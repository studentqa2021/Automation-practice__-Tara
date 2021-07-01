package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.quotings;

public class signup implements login {
@Override
	public void reg() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.navigate().to("http://www.facebook.com");
		driver.manage().window().maximize();
	    WebElement email=driver.findElement(By.xpath("//*[@id='email']"));
	  
	    quotings.addcolors(driver, email);
	    email.sendKeys("tarannumislam4207@gmail.com");
	    
	    
	    
		
		WebElement password=driver.findElement(By.xpath("//*[@id='pass']"));
		   quotings.addcolors(driver, password);
		   password.sendKeys("Tara232$");
		
		   WebElement login=driver.findElement(By.xpath("//*[@name='login']"));
		   quotings.addcolors(driver, login);
		   login.click();
		   driver.quit();
	
	}
	

}
