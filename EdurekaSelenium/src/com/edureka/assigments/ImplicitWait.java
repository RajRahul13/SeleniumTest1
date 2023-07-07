package com.edureka.assigments;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ImplicitWait{
	public static void main(String args[])throws InterruptedException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe" );
				driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		String eTitle = "The Internet";
		String aTitle = "" ;
		//Launch the Chrome Browser and redirect it to the Base URL
		driver.get("http://the-internet.herokuapp.com/" );
		//Maximizes the browser window
		driver.manage().window().maximize() ;
		//Get the actual title of the website
		aTitle = driver.getTitle();
		//Compare the actual title with the expected title
		if (aTitle.equals(eTitle))
		{
			System.out.println( "Test Passed") ;
		}
		else
		{
			System.out.println( "Test Failed" );
		}
		//Close the browser
		driver.close();
	}
}