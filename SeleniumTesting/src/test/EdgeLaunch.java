package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class EdgeLaunch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.edge.driver", "C:\\Users\\M1053553\\Desktop\\TestAutomation\\Drivers\\msedgedriver.exe");
			     WebDriver driver = new EdgeDriver();
			     
			    
			      driver.get("https://www.google.com");
			     
			      Thread.sleep(2000);
			      driver.quit();

	}

}
