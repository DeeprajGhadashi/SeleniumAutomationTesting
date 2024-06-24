package SeleniumTesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws MalformedURLException {

		WebDriver driver = new ChromeDriver();
	    
		
		//driver.get("https://demo.nopcommerce.com/"); //accepts URL only in the string format
		
		 //accept URL in the String format and URL object format
		/*
		driver.navigate().to("https://demo.nopcommerce.com/");  //String format

              //OR 
		URL myurl = new URL ("https://demo.nopcommerce.com/");   //URL object format
		driver.navigate().to(myurl);	    
       */
		
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//navigate().back()
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl()); 
		
		//navigate().forward()
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl()); 
		
		driver.navigate().refresh();
	}

}
