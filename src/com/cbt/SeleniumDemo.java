package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ojuraev\\CyberTek\\Selenium\\drivers\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	
	WebDriver driver2 = new ChromeDriver();
	driver2.get("https://www.ebay.com/");
	
	}
	
}
