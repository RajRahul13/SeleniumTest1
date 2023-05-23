package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginFunctionality {

	static String browser;
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		setBrowser();
		setBrowserConfig();
		runTest();
		
	}
	public static void setBrowser() {
		browser = "Chrome"; 
	//	browser = "EdgeDriver";

	}
	public static void setBrowserConfig() {
		if (browser=="Chrome") {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\M1053553\\Desktop\\TestAutomation\\Drivers\\chromedriver.exe");
		driver= new ChromeDriver();
		}
		
		if (browser=="EdgeDriver") {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\M1053553\\Desktop\\TestAutomation\\Drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		}
	}
	public static void runTest() throws InterruptedException {
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.manage().window().maximize();
		WebElement Email = driver.findElement(By.xpath("//input[@class ='email']"));
		Email.sendKeys("Test@gmail.com");
		WebElement Password = driver.findElement(By.className("password"));
		Password.sendKeys("Test@123");
		WebElement Submit = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
		Submit.click();
		Thread.sleep(5000);
		
		

	}
}