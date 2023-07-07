package com.edureka.assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriverCommands_3 {
	public static void main(String[] args) throws
	InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
				//Create a new instance of the Chrome driver
				WebDriver driver = new ChromeDriver();
		// Open Demo web site
		String appUrl = "https://the-internet.herokuapp.com/";
		driver.get(appUrl);
		Thread.sleep(3000);
		//Click on the A/B Testing Link
		driver.findElement(By.xpath("//*[@id='content']/ul/li[1]/a")).
		click();
		Thread.sleep(3000);
		//Navigate back to the Main Page
		driver.navigate().back();
		Thread.sleep(3000);
		//Navigate back to the A/B Testing page
		driver.navigate().forward();
		Thread.sleep(3000);
		//Navigate back to the Home page
		driver.navigate().to(appUrl);
		Thread.sleep(3000);
		//Refresh browser
		driver.navigate().refresh();
		Thread.sleep(3000);
		// Close the browser
		driver.close();
	}
}