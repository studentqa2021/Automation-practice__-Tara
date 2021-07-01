package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Highlighter;
public class Baselogin implements regestration {
	
	
@Override
public void reg() {
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    //go any webpage ==> get(),navigate ()
	driver.navigate().to("http://automationpractice.com/index.php");
	driver.manage().window().maximize();//maximize
	WebElement signinbtn=driver.findElement(By.xpath("//*[@class=\"login\"]"));

	Highlighter.addcolor(driver, signinbtn);
	signinbtn.click();
	
	

	//driver.findElement(By.xpath("//*[@class=\"login\"]")).click();
	//driver.findElements(null);
//obj.executeScript("arguments[0].setAttribute('style',arguments[1]);",driver.findElement(By.xpath("//*[@id='email']")),"color:yellow;border:2px solid blue;");

	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("tarannumislam4607@gmail.com");
	//obj.executeScript("arguments[0].setAttribute('style',arguments[1]);",driver.findElement(By.xpath("//*[@id='passwd']")),"color:red;border:2px solid blue;");
	driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("Tara232&&");
	//driver.findElement(By.xpath("//*[@class='icon-lock left']")).click();
	//driver.close();
	//driver.quit();

}
}