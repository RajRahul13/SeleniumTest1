package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchExplorer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.ie.driver",
			      "C:\\Users\\M1053553\\Documents\\IEDriverServer_x64_4.0.0\\IEDriverServer.exe");
			     WebDriver driver = new InternetExplorerDriver();
			     
			    
			      driver.get("https://www.facebook.com");
			     
			      Thread.sleep(2000);
			      driver.quit();

	}

}
