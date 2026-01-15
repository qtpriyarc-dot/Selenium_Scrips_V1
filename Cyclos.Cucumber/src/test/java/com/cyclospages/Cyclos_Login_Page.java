package com.cyclospages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cyclos_Login_Page
	{
		@FindBy(id="login-link")
		private WebElement loginlink;
		
		@FindBy(xpath = "//input[@type='text']")
		private WebElement usernametext;
		
		@FindBy(xpath = "//input[@type='password']")
		private WebElement passwordtext;
		
		@FindBy(xpath = "(//button[@type='button'])[2]")
		private WebElement submitbutton;
		
		@FindBy(xpath = "//a[@id='logout-trigger']")
	    private WebElement logoutlink;

		@FindBy(xpath = "//div[@class='invalid-feedback']")
		private WebElement  blankusernameerrormessage;
	    
		public Cyclos_Login_Page(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}
		public boolean check_the_login()
		{
			try
			{
				return loginlink.isDisplayed();
			}
			catch(Exception e)
			{
				return false;
			}
		}
		public void click_on_loglin()
		{
			loginlink.click();
		}
		public void input_username(String uname)
		{
			usernametext.clear();
			usernametext.sendKeys(uname);
		}
		public void input_password(String pwd)
		{
			passwordtext.clear();
			passwordtext.sendKeys(pwd);
		}
		public void click_on_submit()
		{
			submitbutton.click();
		}
		public boolean check_the_logout()
		{
			try
			{
				return logoutlink.isDisplayed();
			}
			catch(Exception e)
			{
				return false;
			}
		}
		public void click_on_logout_link()
		{
			logoutlink.click();
		}
		
		public String blank_username_error()
		{
			return blankusernameerrormessage.getText();
		}
		public void input_login_data(String username,String password)
		{
			check_the_login();
			click_on_loglin();
			input_username(username);
			input_password(password);
			click_on_submit();
			
		}	
		
	}


