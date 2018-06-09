package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\ojuraev\\CyberTek\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.msn.com/");
		
	}
	
}
