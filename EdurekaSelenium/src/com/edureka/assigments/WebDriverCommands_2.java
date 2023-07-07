package com.edureka.assigments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriverCommands_2{
	public static void main(String[] args) throws
	InterruptedException {
		String driverExecutablePath =
				"D:\\ChromeDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",
				driverExecutablePath);
		//Create a new instance of the Chrome driver
		WebDriver driver = new ChromeDriver();
		//Store the application Url in a String variable
		String url = "http://the-internet.herokuapp.com/";
		//Launch the WebSite
		driver.get(url);
		//Store the Title in a String variable
		String title = driver.getTitle();
		//Store Title length in an Integer variable
		int titleLength = driver.getTitle().length();
		//Print Title & Title length on the Console Window
		System.out.println("Title of the Web Page is : " + title);
		System.out.println("Length of the title is : "+ titleLength);

		// Store the Page Source in a String variable
		String pageSource = driver.getPageSource();
		//Store the Page Source length in Integer variable
		int pageSourceLength = pageSource.length();
		//Print the length of the Page Source on the Console Window
		System.out.println("Total length of the Page Source is : " +
				pageSourceLength);
		//Close the browser
		driver.close();
	}
}