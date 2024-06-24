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
	    
	    //WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	    //System.out.println("Display status of logo : " + logo.isDisplayed());
	    
	    //OR
	    
	    // boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
	    //System.out.println("Display status : " + status);
	    
	    //isEnabled()
	    // boolean status = driver.findElement(By.xpath("//input[@id='gender-male']")).isEnabled();
	     //System.out.println("Enable status : " +  status);
	    
	     //isSelected
	     WebElement male_rb = driver.findElement(By.xpath("//input[@id='gender-male']"));
	     WebElement female_rb = driver.findElement(By.xpath("//input[@id='gender-female']")); 
	     
	     System.out.println("Before selection........");
	     System.out.println(male_rb.isSelected());   //false
	     System.out.println(female_rb.isSelected());  //false
	     
	     System.out.println("");
	     male_rb.click();  //select male radio button
	     
	     System.out.println(male_rb.isSelected());  //true
	     System.out.println(female_rb.isSelected());  //false
	     
	     
	     
	}

}
