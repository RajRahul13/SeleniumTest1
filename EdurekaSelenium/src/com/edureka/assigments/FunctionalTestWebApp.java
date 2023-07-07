package com.edureka.assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class FunctionalTestWebApp {

	static String browser;
	static WebDriver driver;
	static Select select;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		setBrowser();
		setBrowserConfig();
		register();
		signIn();
		driver.close();
		
	}
	public static void setBrowser() {
		browser = "Chrome"; 
	//	browser = "EdgeDriver";

	}
	public static void setBrowserConfig() {
		if (browser=="Chrome") {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\M1053553\\eclipse-workspace\\EdurekaSelenium\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver= new ChromeDriver(options);
		}
		
		if (browser=="EdgeDriver") {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\M1053553\\Desktop\\Drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		}
	}
	public static void register() throws InterruptedException {
		driver.get("https://demo.guru99.com/test/newtours/");
		
//		driver.wait(5000);
		
		driver.manage().window().maximize();
		
		WebElement register = driver.findElement(By.xpath("//td[@height='16']//a[@href='register.php']"));
		
		register.sendKeys(Keys.RETURN); //click
		//contact info block
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("rahul");//firstname
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("raj");//lastname
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("1234123456");//phone
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("abc@gmail.com");//email
		
		//mailing information block
		driver.findElement(By.name("address1")).sendKeys("saket");
		driver.findElement(By.name("city")).sendKeys("delhi");
		driver.findElement(By.name("state")).sendKeys("delhi");
		driver.findElement(By.name("postalCode")).sendKeys("110030");
	
		select = new Select(driver.findElement(By.name("country")));	//Selecting from dropdown
		select.selectByValue("INDIA");
		
		//user info block
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("confirmPassword")).sendKeys("password");
		
		//clicking submit
		driver.findElement(By.cssSelector("input[name='submit']")).sendKeys(Keys.RETURN);
	
		Thread.sleep(5000);
	}
	public static void signIn() {
		driver.findElement(By.xpath("//tr[@class='mouseOut']//a[@href='reservation.php']")).sendKeys(Keys.RETURN);
		
		//flight details
		driver.findElement(By.xpath("//input[@value='roundtrip']")).click();//radio button
		
		select = new Select(driver.findElement(By.name("passCount"))); //dropdown
		select.selectByValue("2");
		select = new Select(driver.findElement(By.name("fromPort")));
		select.selectByValue("London");
		select = new Select(driver.findElement(By.name("fromMonth")));
		select.selectByValue("4");
		select = new Select(driver.findElement(By.name("fromDay")));
		select.selectByValue("3");
		select = new Select(driver.findElement(By.name("toPort")));
		select.selectByValue("Paris");
		select = new Select(driver.findElement(By.name("toMonth")));
		select.selectByValue("5");
		select = new Select(driver.findElement(By.name("toDay")));
		select.selectByValue("6");
		
		//prefrences
		driver.findElement(By.xpath("//input[@value='Business']")).click();
		Select select7 = new Select(driver.findElement(By.name("airline")));
		select7.selectByIndex(2);
	}
}


