package com.edureka.assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
public class WebDriverCommands_1 {
	public static void main(String[] args) throws
	InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
		String baseUrl = " http://theinternet.herokuapp.com/forgot_password ";

		//Loads a new web page in the existing browser window
		driver.get(baseUrl);
		//Locate the Textbox via id
		WebElement email = driver.findElement(By.id("email"));
		Thread.sleep(3000);

		//SendKeys method is used to enter text into the Textbox
		email.sendKeys("abc@gmail.com");
		Thread.sleep(3000);

		//Clears all the values in the Textbox
		email.clear();
		Thread.sleep(3000);

		//Locate the Retrieve Password button
		WebElement retrievePassword =
				driver.findElement(By.id("form_submit"));
		Thread.sleep(3000);

		//Use click method to submit the form
		email.sendKeys("abc@gmail.com");
		Thread.sleep(3000);
		retrievePassword.click();
		Thread.sleep(3000);
		driver.close();
		
	}		
}

