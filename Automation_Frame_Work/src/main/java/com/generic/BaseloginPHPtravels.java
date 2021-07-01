package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.method;
import utility.screenshot;
public class BaseloginPHPtravels {
 public void getlogin() {
	 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();// 1
		driver.navigate().to("https://phptravels.com/demo/");// 2
		// screenshot =picture
		screenshot.getscreenshot(driver, "homePage");// 3
		driver.manage().window().maximize();
		// 4 find element
		WebElement singinbtn = driver.findElement(By.xpath("//*[@class='lvl-0 sign-in btn btn-md btn-white-outline']"));
		// highlighter=color
		method.addcolour(driver, singinbtn);// 5
		// screenshot =picture
	
		screenshot.getscreenshot(driver, "BeforeClick");
		singinbtn.click();// 6
		// screenshot =picture
		screenshot.getscreenshot(driver, "AfterClick");
		
		
 }
 }