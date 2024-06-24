package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.nopcommerce.com/register");
	    driver.manage().window().maximize();
	    
	    //isDisplayed()
	    
	    WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	    System.out.println("Display status of logo : " + logo.isDisplayed());
	    
	    //OR
	    
	    boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
	    System.out.println("Display status : " + status);
	    
	}

}
