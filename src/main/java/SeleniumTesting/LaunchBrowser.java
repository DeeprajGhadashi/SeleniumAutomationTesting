package SeleniumTesting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


/*
 Test Case
 1)Lunch Browser(chrome)
 2)Open URL https://demo.opencart.com/
 3)Capture title of the page and Validate title should be "Your Store"
 4)Capture URL and Validate
 5)capture page Source code
 6) close browser
  */

public class LaunchBrowser {

	public static void main(String[] args) {
		
		// 1)Lunch Browser(chrome)
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		// 2)Open URL https://demo.opencart.com/
		driver.get("https://demo.opencart.com/");
		
        //3)Capture title of the page and Validate title should be "Your Store"
		//System.out.println("Title of the web page : " + driver.getTitle());
		
		String act_title = driver.getTitle();
		
		if(act_title.equals("Your Store"))
		{
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}	

		//4)Capture URL and Validate
		String act_URL = driver.getCurrentUrl();
		
		if(act_URL.equals("https://demo.opencart.com/"))
		{
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		
		 //5)capture page Source code
		 System.out.println(driver.getPageSource());
		
		 // 6) close browser
		 driver.close();
		 //driver.quit();
		 
	}

}
