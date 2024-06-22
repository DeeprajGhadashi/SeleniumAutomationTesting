package SeleniumTesting;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.opencart.com/");
	    driver.manage().window().maximize();
	    
	    //name
	   // driver.findElement(By.name("search")).sendKeys("Macbook");

	    //id
	    boolean logoDisplaystatus= driver.findElement(By.id("logo")).isDisplayed();
	    System.out.println(logoDisplaystatus);
	    
	    
	}

}
