package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.opencart.com/");
	    driver.manage().window().maximize();
	    
	    //Xpath with single attribute
	   // driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Tshirts");
	    
	  //Xpath with multiple attribute
	    driver.findElement(By.xpath("//input[@placeholder='Search'][@name='search']")).sendKeys("Tshirts");

	  //Xpath with 'and' operator
	    driver.findElement(By.xpath("//input[@placeholder='Search' and @name='search']")).sendKeys("Tshirts");

	 
	}

}
