package SeleniumTesting;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.opencart.com/");
	    driver.manage().window().maximize();
	    
	    //name
	   // driver.findElement(By.name("search")).sendKeys("Macbook");

	    //id
	    //boolean logoDisplaystatus= driver.findElement(By.id("logo")).isDisplayed();
	    //System.out.println(logoDisplaystatus);
	    
	    //linkText & partialLinkText
	    //driver.findElement(By.linkText("Tablets")).click();
	    //driver.findElement(By.partialLinkText("Tab")).click()List<A>    
	    
	    //className
	    List <WebElement>  headerLinks = driver.findElements(By.className("list-inline-item"));
	    System.out.println("Total number of header links : " + headerLinks.size());
	}

}
