package com.edureka.assigments;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ExplicitWait {
	@SuppressWarnings("deprecation")
	public static void main(String args[])throws InterruptedException {
		
		//Create a reference variable for the WebDriver
		WebDriver drv;
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe" );

		//Initialize the drv variable using ChromeDriver
		drv=new ChromeDriver();

		//Launch the Demo Website
		drv.get("http://the-internet.herokuapp.com/forgot_password");

		//Maximize the Browser Window
		drv.manage().window().maximize();
		drv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Save the GUI element reference into a "username" variable of WebElement type
		WebElement username = drv.findElement(By.id("email"));

		//Enter the username into the textbox
		username.sendKeys("abc@gmail.com");


		//Explicit wait - to wait for the "Retrieve Password" button to be click-able
		WebDriverWait wait= new WebDriverWait(drv, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("forgot_password")));

				//Click on the "Retrieve Password" button once visible
				drv.findElement(By.id("form_submit")).click();
				drv.quit();

	}
}
