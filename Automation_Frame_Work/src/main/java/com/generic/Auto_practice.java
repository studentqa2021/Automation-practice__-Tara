package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Mark;

public class Auto_practice {
public void website() {
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	Masterpagefactory obj = new Masterpagefactory(driver);
	obj.getloginbtn().click();
	
	 obj.getEmail().sendKeys("tarannum4207@gmail.com");
	obj.getPasswrd().sendKeys("Tara232$");
	obj.getsigninbtn().click();
	driver.quit();
}
}

