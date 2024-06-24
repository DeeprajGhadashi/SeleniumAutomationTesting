package SeleniumTesting;


import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class GetMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//get(url) - opens the url on the browser.
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
		
		//getTitle() - returns title of the page
		System.out.println(driver.getTitle());  //OrangeHRM
		
		//getCurrentUrl() - returns URL of the page
		System.out.println(driver.getCurrentUrl()); //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
		
		//getPageSource() - returns source code of the page
	    System.out.println(	driver.getPageSource());
		
		//getWindoHandle() - returns IDof the single Browser window
	   String windowid = driver.getWindowHandle();
	   System.out.println("Window ID:" + windowid);
	   
	   //getWindowHandles() - return ID's of the multiple browser windows
	   
	   driver.findElement(By.linkText("OrangeHRM, Inc")).click(); //this will opens new browser window
	   Set <String> windowids = driver.getWindowHandles();
	   System.out.println(windowids);
	   
	}

}
