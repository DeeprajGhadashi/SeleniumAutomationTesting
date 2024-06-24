package SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class XPathDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.opencart.com/");
	    driver.manage().window().maximize();
	    
	    //Xpath with single attribute
	   // driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Tshirts");
	    
	  //Xpath with multiple attribute
	   // driver.findElement(By.xpath("//input[@placeholder='Search'][@name='search']")).sendKeys("Tshirts");

	  //Xpath with 'and' operator
	    //driver.findElement(By.xpath("//input[@placeholder='Search' and @name='search']")).sendKeys("Tshirts");

	   //Xpath with 'or' operator
		// driver.findElement(By.xpath("//input[@placeholder='Search'or @name='search']")).sendKeys("Tshirts");
		 
	   //Xpath with text() - inner text
	/*  boolean displaystatus = driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		System.out.println(displaystatus);
		
		String value = driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		System.out.println(value);
	 */
	    
	    // Xpath with contains()
	    //driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Tshirts");
	    
		//chained Xpath
	    boolean status = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
	    System.out.println(status);
	}

}
