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
		
		driver.navigate().to("https://demo.nopcommerce.com/");  //String format

		URL myurl = new URL ("https://demo.nopcommerce.com/");   //URL object format
		driver.navigate().to(myurl);	    

	}

}