package com;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\browser driver\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://www.google.com");
	}

}
