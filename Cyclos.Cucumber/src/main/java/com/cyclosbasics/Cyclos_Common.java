package com.cyclosbasics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Cyclos_Common
{
	WebDriver d;
	String browser="FF";
	public String url="https://demo.cyclos.org/ui/home";
	
	
	public void launchbrowser()
	{
		if(browser.equals("FF"))
		{
			d = new ChromeDriver();
		}
		else if (browser.equals("GC"))
		{
				d = new FirefoxDriver();
		}
		else if (browser.equals("EB"))
		{
			d = new EdgeDriver();
		}
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
	}
	
	public void closebrowser() throws Exception
	{
		Thread.sleep(3000);
		d.quit();
	}
}


