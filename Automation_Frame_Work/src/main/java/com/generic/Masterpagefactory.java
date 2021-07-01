package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Masterpagefactory {
	Masterpagefactory(WebDriver driver){// using constructor to remove pointer
		//exception.
		PageFactory.initElements(driver,this);
		
		
	}
	@FindBy(xpath="//*[contains(text(),'Sign in')]")
	private WebElement loginbtn;
	
	@FindBy(xpath="//*[contains(text(),'Email')]")
	private WebElement email;
	
	@FindBy(xpath="//*[contains(text(),'Password')]")
	private WebElement password;
	
	@FindBy(xpath="//*[contains(text(),'Sign in')]")
	private WebElement signinbtn;
	public WebElement getloginbtn() {
		return loginbtn;
	}
		public WebElement getEmail() {
			return email;
			
		}
		public WebElement getPasswrd() {
			return password;
		}
		public WebElement getsigninbtn() {
			return signinbtn;
		}
	}

 